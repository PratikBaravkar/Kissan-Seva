package com.farmsystem.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmsystem.backend.repository.BuyerCartRepo;
import com.farmsystem.backend.repository.BuyerRepo;
import com.farmsystem.backend.repository.FarmerRepo;
import com.farmsystem.backend.repository.OrderRepo;
import com.farmsystem.backend.repository.ProductRepo;

@RestController
@RequestMapping("/buyer")
public class BuyerController 
{
	@Autowired
	BuyerRepo buyerRepo;
	
	@Autowired
	BuyerCartRepo buyercartRepo;
	
	@Autowired
	FarmerRepo farmerRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	OrderRepo orderRepo;

	

}
