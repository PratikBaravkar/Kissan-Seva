package com.farmsystem.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.farmsystem.backend.entity.Farmer;
import com.farmsystem.backend.entity.Product;
import com.farmsystem.backend.repository.AdminRepo;
import com.farmsystem.backend.repository.BuyerCartRepo;
import com.farmsystem.backend.repository.BuyerRepo;
import com.farmsystem.backend.repository.FarmerRepo;
import com.farmsystem.backend.repository.OrderRepo;
import com.farmsystem.backend.repository.ProductRepo;

public class FarmerController {

	@Autowired
	private FarmerRepo farmerRepo;
	
	@Autowired
	private BuyerCartRepo buyercartrepo;
	
	@Autowired
	private ProductRepo productrepo;
	
	@Autowired
	private BuyerRepo buyerrepo;
	
	@Autowired
	private AdminRepo adminrepo;
	
	@Autowired
	private OrderRepo orderepo;
	
	
	public String regFarmer(Farmer farmer)
	{
		farmerRepo.save(farmer);
		return "register_success";
	}
	
	public String loginUser()
	{
		//login existing farmer
		return null;
		
	}
	
	public String forgotPassword()
	{
		//for registering new password for existing username
		return null;
		
	}
	
	public String getProduct(Product product)
	{
		return null;
		
	}
	
	public String getDetails()
	{
		//order details
		return null;		
	}
	
}
