package com.tts.ECommerce.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	
	private int quantity; 
	private float price; 
	private String description; 
	private String name; 
	private String brand; 
	private String category; 
	private String image;
	
	public Product(int quantity, float price, String description, String name, String brand, String category,
			String image) {
		this.quantity = quantity;
		this.price = price;
		this.description = description;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.image = image;
	}
	public Product() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", quantity=" + quantity + ", price=" + price + ", description=" + description
				+ ", name=" + name + ", brand=" + brand + ", category=" + category + ", image=" + image + "]";
	} 
	
	
	
}
