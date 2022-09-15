package com.farmsystem.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.farmsystem.backend.entity.Admin;
import com.farmsystem.backend.entity.Buyer;
import com.farmsystem.backend.entity.Farmer;
import com.farmsystem.backend.entity.Order;
import com.farmsystem.backend.entity.Product;
import com.farmsystem.backend.repository.AdminRepo;
import com.farmsystem.backend.repository.BuyerRepo;
import com.farmsystem.backend.repository.FarmerRepo;
import com.farmsystem.backend.repository.OrderRepo;
import com.farmsystem.backend.repository.ProductRepo;


@RestController
@RequestMapping("/admin")
public class AdminController {

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
	
	@Autowired
	private OrderRepo orderepo;
	
	@PostMapping("/login")
	public String loginUser(@RequestBody  Admin admin) {
		List<Admin> adminList =adminRepo.findAll();
		
		String passMsg="pass";
		String failMsg="fail";
		
		for(Admin adminobj : adminList)
		{
			if(adminobj.getUser_name().equals(admin.getUser_name())&&adminobj.getPassword().equals(admin.getPassword()))
			{
				return passMsg;
			}
		}
		return failMsg;
		
		
	}
	
	@GetMapping("/buyer-list")
	public List<Buyer> getBuyers()
	{
		List<Buyer> buyerList=buyerRepo.findAll();
		return buyerList;
	}
	
	@GetMapping("/farmer-list")
	public List<Farmer> getFarmers(){
		
		List<Farmer> farmerList=farmerRepo.findAll();
		return farmerList;
	}
	

	@GetMapping("/total-orders")
	public List<Order> getOrders(){
		
		List<Order> orderList=orderRepo.findAll();
		return orderList;

	

	}
	
	@GetMapping("/products")
	public List<Product> getProduct(){
		List<Product> productList=productRepo.findAll();
		return productList;	
	}
	
	
}//Admin Controller  closing
