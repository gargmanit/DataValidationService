package com.Rest.DataServiceLayer.DataServiceLayer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rest.DataServiceLayer.DataServiceLayer.pojo.FulfilmentCenter;


public interface FCDataRepository extends JpaRepository<FulfilmentCenter, Integer> {
	
}

