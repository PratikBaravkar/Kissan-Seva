package com.farmsystem.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.farmsystem.backend.repository.FarmerRepo;

public class FarmerController {

	@Autowired
	FarmerRepo farmerRepo;

}
