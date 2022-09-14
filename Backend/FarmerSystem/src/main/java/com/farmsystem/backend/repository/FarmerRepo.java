package com.farmsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.farmsystem.backend.entity.Farmer;

public interface FarmerRepo extends JpaRepository<Farmer, Integer> {

	@Query()
	public int findByName(String user_name);
	
	@Query
	public int findById(String name);
	
	@Query
	public void updateFirstName();
	
	@Query
	public void updateLastNAme();
	
	@Query
	public void updateEmail();
	
	@Query
	public void updateContact();
	
	@Query
	public void updatePassword();

	@Query
	public void updateAdress();
}
