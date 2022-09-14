package com.farmsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmsystem.backend.entity.Order;

public interface OrderRepo extends JpaRepository<Order,Integer>{

}
