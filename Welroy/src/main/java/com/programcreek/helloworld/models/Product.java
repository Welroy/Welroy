package com.programcreek.helloworld.models;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
@Id
	private String id;
	private String name;
	private String description;
	

	public String getProductId() {
		return id;
	}
	public void setProductId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return name;
	}
	public void setProductName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
