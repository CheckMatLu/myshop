package com.myshop.productmanagementservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myshop.productmanagementservice.model.Product;
import com.myshop.productmanagementservice.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping()
	public List<Product> retrieveAllProducts() {
		return productService.getAllProducts();
	}

//	@PostMapping()
//	public ResponseEntity<Object> createProduct(@Valid @RequestBody Product product) {
//		Product savedProduct = productService.updateProduct(product);
//
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(savedProduct.getId()).toUri();
//		return ResponseEntity.created(location).build();
//	}

}
