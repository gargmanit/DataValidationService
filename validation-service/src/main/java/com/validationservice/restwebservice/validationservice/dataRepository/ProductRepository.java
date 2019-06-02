package com.validationservice.restwebservice.validationservice.dataRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.validationservice.restwebservice.validationservice.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	
}
