package com.myshop.productmanagementservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.myshop.productmanagementservice.model.Product;
import com.myshop.productmanagementservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private Environment environment;

	@Override
	public List<Product> getAllProducts() {

		List<Product> p = new ArrayList<Product>();
		p.add(new Product(1, environment.getProperty("test.value"), "DescProduct1"));
		p.add(new Product(2, "Product2", "DescProduct2"));
		p.add(new Product(1, "Product3", "DescProduct3"));
		return p; // productRepository.findAll();
	}
//
//	@Override
//	public Optional<Product> getProduct(Integer id) {
//		final Optional<Product> product = productRepository.findById(id);
//		if (!product.isPresent()) {
//			throw new ProductNotFoundException("Product not found: id-" + id);
//		}
//
//		return product;
//	}
//
//	@Override
//	public Product updateProduct(Product product) {
//
//		return productRepository.save(product);
//	}
//
//	@Override
//	public void deleteProduct(Product product) {
//
//		productRepository.delete(product);
//	}

}
