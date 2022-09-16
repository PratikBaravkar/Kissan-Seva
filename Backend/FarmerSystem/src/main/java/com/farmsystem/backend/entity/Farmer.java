package com.farmsystem.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="farmers")
public class Farmer {
	
	@Id
	@Column(name="fid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fid;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;
	
	@Column(name="user_name")
	private String user_name;
	
	
	public int getFid() {
		return fid;
	}


	public void setFid(int id) {
		this.fid = id;
	}



	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public Farmer(int id, String firstname, String lastname, String contact, String email, String password,
			String address, String user_name) {
		super();
		this.fid = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.email = email;
		this.password = password;
		this.address = address;
		this.user_name = user_name;
	}

	public Farmer()
	{
		
	}


	@Override
	public String toString() {
		return "Farmer [id=" + fid + ", firstname=" + firstname + ", lastname=" + lastname + ", contact=" + contact
				+ ", email=" + email + ", password=" + password + ", address=" + address + ", user_name=" + user_name
				+ "]";
	}
	
	
}
