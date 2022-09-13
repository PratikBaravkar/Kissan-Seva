package com.farmsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.farmsystem.backend.entity.Buyer;

public interface BuyerRepo extends JpaRepository<Buyer, Integer> 
{
	@Query( nativeQuery = true,value="select bid from buyers where user_name=:user_name")
	public int findByName(@Param("user_name") String user_name);
	
	@Modifying
	@Transactional
	@Query( nativeQuery = true,value="update buyers set firstname=:firstname where user_name=:user_name")
	public void updateFirstName(@Param("firstname") String firstname,@Param("user_name") String user_name );
	
	@Modifying
	@Transactional
	@Query( nativeQuery = true,value="update buyers set lastname =:lastname where user_name=:user_name")
	public void updateLastName(@Param("lastname") String lastname,@Param("user_name") String user_name );
	
	

}
