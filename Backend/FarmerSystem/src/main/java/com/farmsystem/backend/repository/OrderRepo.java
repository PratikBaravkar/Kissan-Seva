package com.farmsystem.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.farmsystem.backend.entity.Order;

public interface OrderRepo extends JpaRepository<Order,Integer>{
	
@Query(name="byName",nativeQuery=true,value="select * from orders where fid=:fid")
public List<Order> findById(@Param("fid") int fid);

}
