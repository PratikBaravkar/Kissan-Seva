package com.farmsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmsystem.backend.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>
{

}
