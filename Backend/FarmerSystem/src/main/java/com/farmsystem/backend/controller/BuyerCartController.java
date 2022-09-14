package com.farmsystem.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmsystem.backend.entity.BuyerCart;
import com.farmsystem.backend.repository.BuyerCartRepo;
import com.farmsystem.backend.repository.ProductRepo;

@CrossOrigin
@RestController
@RequestMapping("/buyer-cart")
public class BuyerCartController 
{
	@Autowired
	BuyerCartRepo buyercartRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	@PostMapping("/add")
	public String regFarmer(@RequestBody BuyerCart cart)
	{
		buyercartRepo.save(cart);
		return "added _successfully";
	}
	
	@PostMapping("/remove")
	public String removeItem(@RequestBody BuyerCart cart)
	{
		buyercartRepo.deleteById(cart.getCartid());
		return "deleted_successfully";
	}
	

}
