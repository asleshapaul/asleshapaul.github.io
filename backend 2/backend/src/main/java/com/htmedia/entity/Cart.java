package com.htmedia.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	@OneToMany(  cascade = CascadeType.ALL)
	List<ProductModel> cartItems;
	
	Long quantity;
	Long price;
	
	Long personId;
	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}





	public List<ProductModel> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<ProductModel> cartItems) {
		this.cartItems = cartItems;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Long id, List<ProductModel> cartItems, Long quantity, Long price, Long personId) {
		super();
		this.id = id;
		this.cartItems = cartItems;
		this.quantity = quantity;
		this.price = price;
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", cartItems=" + cartItems + ", quantity=" + quantity + ", price=" + price
				+ ", personId=" + personId + "]";
	}

	
}