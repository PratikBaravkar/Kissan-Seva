package com.farmsystem.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="products")
public class Product {

	@Id
	@Column(name="pid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	
	@ManyToOne
	@JoinColumn(name="fid")
	private Farmer farmer;
	
	@Column(name="crop")
	private String crop;
	
	@Column(name="quantity")
	private double quantity;
	
	@Column(name="expected_price")
	private double expected_price;
	
	public Product() {
				
	}
	
	public Product(int pid, Farmer farmer, String crop, double quantity, double expected_price) {
		super();
		this.pid = pid;
		this.farmer = farmer;
		this.crop = crop;
		this.quantity = quantity;
		this.expected_price = expected_price;
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public Farmer getFarmer() {
		return farmer;
	}



	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}



	public String getCrop() {
		return crop;
	}



	public void setCrop(String crop) {
		this.crop = crop;
	}



	public double getQuantity() {
		return quantity;
	}



	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}



	public double getExpected_price() {
		return expected_price;
	}



	public void setExpected_price(double expected_price) {
		this.expected_price = expected_price;
	}



	


}
