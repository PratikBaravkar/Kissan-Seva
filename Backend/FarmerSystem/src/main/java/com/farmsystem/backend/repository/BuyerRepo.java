package com.farmsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmsystem.backend.entity.Buyer;

public interface BuyerRepo extends JpaRepository<Buyer, Integer>
{

}
