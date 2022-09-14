package com.farmsystem.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.farmsystem.backend.repository.AdminRepo;
import com.farmsystem.backend.repository.BuyerCartRepo;
import com.farmsystem.backend.repository.BuyerRepo;
import com.farmsystem.backend.repository.FarmerRepo;
import com.farmsystem.backend.repository.ProductRepo;

public class FarmerController {

	
	private FarmerRepo farmerRepo;
	
	private BuyerCartRepo buyercartrepo;

	private ProductRepo productrepo;
	
	private BuyerRepo buyerrepo;
	
	private AdminRepo adminrepo;
	
	
}
