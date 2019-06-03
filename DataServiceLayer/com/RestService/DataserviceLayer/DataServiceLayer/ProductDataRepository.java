package com.RestService.DataserviceLayer.DataServiceLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDataRepository extends JpaRepository<ProductPool,Integer> {
	
}
