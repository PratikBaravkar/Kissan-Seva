package com.farmsystem.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmsystem.backend.entity.Buyer;
import com.farmsystem.backend.entity.Farmer;
import com.farmsystem.backend.repository.AdminRepo;
import com.farmsystem.backend.repository.BuyerRepo;
import com.farmsystem.backend.repository.FarmerRepo;
import com.farmsystem.backend.repository.OrderRepo;
import com.farmsystem.backend.repository.ProductRepo;

@CrossOrigin
@RestController 
@RequestMapping("/change-profile")
public class ProfileController {
	
	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	BuyerRepo buyerRepo;
	
	@Autowired
	OrderRepo orderRepo;
	
	
	@Autowired
	FarmerRepo farmerRepo;
	
	
	@PostMapping("farmer/{username}")
	public String updateFarmerProfile(@PathVariable String username,@RequestBody Farmer farmer)
	{
		if(farmer.getFirstname()!="")
		{
			farmerRepo.updateFirstName(farmer.getFirstname(), username);
		}
		
		if(farmer.getLastname()!="")
		{
			farmerRepo.updateFirstName(farmer.getLastname(), username);
		}
		
		if(farmer.getContact()!="")
		{
			farmerRepo.updateFirstName(farmer.getContact(), username);
		}
		
		if(farmer.getEmail() !="")
		{
			farmerRepo.updateFirstName(farmer.getEmail() , username);
		}
		
		if(farmer.getAddress() !="")
		{
			farmerRepo.updateFirstName(farmer.getAddress(), username);
		}
		
		return "updated";
	}
		
		@PostMapping("buyer/{username}")
		public String updateBuyerProfile(@PathVariable String username,@RequestBody Buyer buyer)
		{
			System.out.println(username);
			
			System.out.println(buyer.getAddress());
			if(buyer.getFirstname()!= "")
			{
				buyerRepo.updateFirstName(buyer.getFirstname(),username);
			}
			if(buyer.getLastname()!= "")
			{
				buyerRepo.updateLastName(buyer.getLastname(), username);
			}
			if(buyer.getContact()!="")
			{
				buyerRepo.updateContact(buyer.getContact(), username);
			}
			if(buyer.getEmail()!= "")
			{
				buyerRepo.updateEmail(buyer.getEmail(), username);
			}
			if(buyer.getAddress()!= "")
			{
				buyerRepo.updateAddress(buyer.getAddress(), username);
			}
			
			
			
			return "updated";
		}
	
	
	

}// Profile Controller closing
