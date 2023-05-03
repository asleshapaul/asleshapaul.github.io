package com.htmedia.entity;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class ProductModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String []image;
	Long quantity;
	String title;
	Long price;
	Long productId;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	Cart cart;

	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String[] getImage() {
		return image;
	}
	public void setImage(String [] image) {
		this.image = image;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductModel(Long productId, String []image, Long quantity, String title, Long price) {
		super();
		this.productId = productId;
		this.image = image;
		this.quantity = quantity;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductModel [image=" + Arrays.toString(image) + ", quantity=" + quantity + ", title=" + title
				+ ", price=" + price + ", productId=" + productId + "]";
	}

}
