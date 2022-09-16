package com.farmsystem.backend.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmsystem.backend.entity.Farmer;
import com.farmsystem.backend.entity.Order;
import com.farmsystem.backend.entity.Product;
import com.farmsystem.backend.repository.FarmerRepo;
import com.farmsystem.backend.repository.OrderRepo;
import com.farmsystem.backend.repository.ProductRepo;


@CrossOrigin
@RestController
@RequestMapping("/farmer")
public class FarmerController 
{
	@Autowired
	FarmerRepo farmerRepo;
	
	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	

	
		
	@GetMapping("/remove/{username}")
	public String removeFarmer(@PathVariable String username) {

		
		int fid = farmerRepo.findByUser_name(username);
			          
		 farmerRepo.deleteById(fid);
		 
		 return "updated";
		    
	}
	
	@GetMapping("/profile/{username}")
	public Optional<Farmer> getFarmer(@PathVariable String username) {

		
		int fid = farmerRepo.findByUser_name(username);
			          
		return farmerRepo.findById(fid);
		    
	}
	
	@PostMapping("/forgot-password")
	public String forgotPassword(@RequestBody Farmer farmer)
	{
		String username = farmer.getUser_name();
		String newpassword = farmer.getPassword();
		
		farmerRepo.updatePassword(newpassword,username);
		
		return "updated";
	}
	
	@PostMapping("/Registration")
	public String regFarmer(@RequestBody Farmer farmer) {

		System.out.println(farmer.toString());

		    farmerRepo.save(farmer);
		    
		   
		     
		    return "register_success";
		    
	}
	
	
	@PostMapping("/login")
	public String loginUser(@RequestBody Farmer farmer) {
	        
			System.out.println(farmer.getUser_name());
		
			List<Farmer> farmerList = farmerRepo.findAll();              
			
			String passMsg = "pass" ;
			String failMsg = "fail" ;
			
			for(Farmer farmerobj : farmerList )
			{
			if(farmerobj.getUser_name().equals(farmer.getUser_name()) && farmerobj.getPassword().equals(farmer.getPassword()))
				{
				
					
					return passMsg ;
				}
			}
		
		return failMsg;
	}
	
	
	@PostMapping("/orders")
	public List<Order> getDetails(@RequestBody Farmer farmer)
	{
		String uname = farmer.getUser_name();
		
		int fid = farmerRepo.findByUser_name(uname);
		
		List<Order> orderList = orderRepo.findById(fid);  
		
		return orderList;
		
	}
	
		@PostMapping("/my-product")
	public List<Product> getMyProduct(@RequestBody Farmer farmer)
	{
		
		
		int fid = farmerRepo.findByUser_name(farmer.getUser_name());
		
		List<Product> productList = productRepo.findByFid(fid);  
		
		return productList;

		
	}
	
	@PostMapping("/add-product")
	public String getDetails(@RequestBody Product product)
	{
		System.out.println(product.getCrop());
		String uname = product.getFarmer().getUser_name();
		
		int fid = farmerRepo.findByUser_name(uname);
		
		product.getFarmer().setFid(fid);
		
		productRepo.save(product);
	     
	    return "register_success";
		
	}
	
	
}
