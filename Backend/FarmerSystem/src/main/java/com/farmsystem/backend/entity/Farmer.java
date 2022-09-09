package com.farmsystem.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Farmer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fid")
	private int id;
	
	private String firstname;
	private String lastname;
	private String contact;
	private String email;
	private String password;
	private String address;
	private String user_name;
	
	
	public Farmer() {
		
		
	}

	

}
