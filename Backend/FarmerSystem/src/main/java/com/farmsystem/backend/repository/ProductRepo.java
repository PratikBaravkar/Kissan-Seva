package com.farmsystem.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.farmsystem.backend.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>
{
	@Query(nativeQuery = true,value="select * from products where crop=:crop")
	public List<Product> findProduct(@Param("crop") String item);
	
	
	@Query(nativeQuery = true,value="select quantity from products where fid=:fid And crop=:crop")
	public double getQuantity(@Param("fid") int fid ,@Param("crop") String crop);
	
//	@Query()
//	public void deleteQuantityCompletly();
//	
//	@Query
//	public void deductQuantity();
//	
}
