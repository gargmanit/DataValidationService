package com.Rest.DataServiceLayer.DataServiceLayer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rest.DataServiceLayer.DataServiceLayer.pojo.ProductPool;

@Repository
public interface ProductDataRepository extends JpaRepository<ProductPool, Integer> {
	
}
