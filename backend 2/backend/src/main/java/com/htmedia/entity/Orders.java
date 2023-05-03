package com.htmedia.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	Long orderId;

	@OneToMany(  cascade = CascadeType.ALL)
	List<ProductModel> orderItems;
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}





	public Orders(Long id, Long orderId, List<ProductModel> orderItems, Long quantity, Long price, Long personId) {
		super();
		this.id = id;
		this.orderId = (long) (Math.random()*1000000);
		this.orderItems = orderItems;
		this.quantity = quantity;
		this.price = price;
		this.personId = personId;
	}



	public Long getPersonId() {
		return personId;
	}



	public void setPersonId(Long personId) {
		this.personId = personId;
	}



	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderId=" + orderId + ", orderItems=" + orderItems + ", quantity=" + quantity
				+ ", price=" + price ;
	}



	public List<ProductModel> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<ProductModel> orderItems) {
		this.orderItems = orderItems;
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



	Long quantity;
	Long price;
	
	Long personId;


}
