package com.farmsystem.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
		//farmerRpo.
		return "updated";
		
	}

	
}// ProfileController closing
