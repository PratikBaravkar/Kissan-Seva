package com.farmsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmsystem.backend.entity.BuyerCart;

@Repository
public interface BuyerCartRepo extends JpaRepository<BuyerCart, Integer> {

}
