package com.myshop.productmanagementservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myshop.productmanagementservice.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}
