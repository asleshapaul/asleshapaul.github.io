package com.htmedia.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	private String password;
	private String email;
	private String gender;
	private String phone;
	private String username;
	private Date dob;
	
	@OneToOne
	Cart cart;
	
	@Lob
	private byte[] image;
	

	private String isApproved;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date create_ts;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_ts;
	

	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}



	public String getIsApproved() {
		return isApproved;
	}


	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}




	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Person(int id, String name, String password, String email, Date dob, byte[] image, String gender,
			String phone, String username,String isApproved, Date create_ts, Date updated_ts) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.image = image;
		this.gender = gender;
		this.phone = phone;
		this.username = username;
		this.isApproved = isApproved;
		this.create_ts = create_ts;
		this.updated_ts = updated_ts;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}




	public String isApproved() {
		return isApproved;
	}


	public void setApproved(String isApproved) {
		this.isApproved = isApproved;
	}


	public Date getCreate_ts() {
		return create_ts;
	}


	public void setCreate_ts(Date create_ts) {
		this.create_ts = create_ts;
	}


	public Date getUpdated_ts() {
		return updated_ts;
	}


	public void setUpdated_ts(Date updated_ts) {
		this.updated_ts = updated_ts;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", dob=" + dob
				+ ", image=" + Arrays.toString(image) + ", gender=" + gender + ", phone=" + phone + ", username="
				+ username + ", isApproved=" + isApproved + ", create_ts=" + create_ts
				+ ", updated_ts=" + updated_ts ;
	}


//	public List<Order> getOrders() {
//		return orders;
//	}
//
//
//	public void setOrders(List<Order> orders) {
//		this.orders = orders;
//	}

	
	
}
