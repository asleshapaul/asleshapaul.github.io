package com.htmedia.model;

import java.util.Date;

import javax.persistence.Lob;

public class PersonModel {

	@Override
	public String toString() {
		return "PersonModel [name=" + name + ", password=" + password + ", email=" + email + ", image=" + image
				+ ", phone=" + phone + "]";
	}
	private String name;
	private String password;
	private String email;
	private String image;
	private String phone;
	public PersonModel() {
		// TODO Auto-generated constructor stub
	}
	public PersonModel(String name, String password, String email, String phone, String username, String image) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
