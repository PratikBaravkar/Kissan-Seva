package com.farmsystem.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmsystem.backend.entity.Farmer;

public interface FarmerRepo extends JpaRepository<Farmer, Integer> {

}
