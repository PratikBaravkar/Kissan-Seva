package com.farmsystem.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.farmsystem.backend.entity.Farmer;
import com.farmsystem.backend.entity.Order;
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
		//registering farmer
		System.out.println(farmer.toString());
		farmerRepo.save(farmer);
		return "register_success";
	}
	
	public String loginUser(Farmer farmer)
	{
		//login existing farmer with login credentials
		System.out.println(farmer.getUser_name());
		List<Farmer> farmerlist = farmerRepo.findAll();
		
		String passMsg = "pass";
		String failMsg = "fail";
		for(Farmer farmerobj : farmerlist)
		{
			if(farmerobj.getUser_name().equals(farmer.getUser_name()) && farmerobj.getPassword().equals(farmer.getPassword()))
			{
				return passMsg;
			}
		}
		return failMsg;		
	}
	
	public String forgotPassword(Farmer farmer)
	{
		//for registering new password for existing username
		String username = farmer.getUser_name();
		String newpassword = farmer.getPassword();
		
		farmerRepo.updatePassword(newpassword,username);
		return "updated";
		
	}
	
	
	public String getDetails(Farmer farmer)
	{
		//Farmer details
		return null;		
	}
	
	public String getDetails(Product product)
	{
		//getting product details
		return null;
		
	}
	
	public String getDetails(Order order)
	{
		//order details
		return null;		
	}
	
}
