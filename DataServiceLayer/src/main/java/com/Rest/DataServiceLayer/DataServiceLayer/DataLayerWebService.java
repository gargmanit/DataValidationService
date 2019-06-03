package com.Rest.DataServiceLayer.DataServiceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Rest.DataServiceLayer.DataServiceLayer.Exception.ProductNotFoundException;
import com.Rest.DataServiceLayer.DataServiceLayer.Repositories.FCDataRepository;
import com.Rest.DataServiceLayer.DataServiceLayer.Repositories.ProductDataRepository;
import com.Rest.DataServiceLayer.DataServiceLayer.pojo.FulfilmentCenter;
import com.Rest.DataServiceLayer.DataServiceLayer.pojo.ProductPool;

@RestController
public class DataLayerWebService {
	
	@Autowired
	ProductDataRepository productDataRepository;
	
	@Autowired
	FCDataRepository dataFulfillmentRepository;
	
	
	@PostMapping("/products")
	public void saveProductService(@RequestBody ProductPool product) {
		//System.out.println(product);
		List<FulfilmentCenter> fc = product.getFulfilmentCenter();
		Optional<ProductPool> productInDb  = productDataRepository.findById(product.getProductId());
		
		if(productInDb.isPresent()) {
			
			for(FulfilmentCenter center: fc) {
				center.setProductpool(productInDb.get());
				dataFulfillmentRepository.save(center);
			}
		}
		else {
			productDataRepository.save(product);
			
		}
		
		
	}

	@GetMapping("/products/{id}")
	public Optional<ProductPool> getProductService(@PathVariable Integer id) {
		
		  Optional<ProductPool> pool = productDataRepository.findById(id);
		  if (!pool.isPresent())
			  throw new ProductNotFoundException("id: "+id);
		  
		  return pool;
	}
		
	
	@GetMapping("/products")
	public List<ProductPool> getAllProducts() {
		return productDataRepository.findAll();
	}
		
	}

