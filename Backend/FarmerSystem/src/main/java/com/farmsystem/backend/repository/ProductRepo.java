package com.farmsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmsystem.backend.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>
{
	@Query(nativeQuery = true,value="select * from products where crop=:crop")
	public List<Product> findProduct(@Param("crop") String item);
	
	
	@Query(nativeQuery = true,value="select quantity from products where fid=:fid And crop=:crop")
	public double getQuantity(@Param("fid") int fid ,@Param("crop") String crop);
}
