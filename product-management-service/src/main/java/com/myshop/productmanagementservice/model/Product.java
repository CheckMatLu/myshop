package com.myshop.productmanagementservice.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "A Product that can be ordered")
@Document(collection = "PRODUCT")
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;

	public Product() {
		super();
	}

	public Product(int id, String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

}
