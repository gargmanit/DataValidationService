package com.RestService.DataserviceLayer.DataServiceLayer;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.RestService.DataserviceLayer.DataServiceLayer.Exceptions.ProductNotFoundException;

@RestController
public class DataLayerWebService {
	
	@Autowired
	ProductDataRepository productDataRepository;
	
	@Autowired
	DataFulfillmentRepository dataFulfillmentRepository;
	
	

	

	@PostMapping("/products")
	public void saveProductService(@RequestBody ProductPool product) {
		//System.out.println(product);
		List<FulfillmentCenter> fc = product.getFulfillmentCenter();
		Optional<ProductPool> productInDb  = productDataRepository.findById(product.getproductId());
//		
//		if(productInDb.isPresent()) {
//			
//			for(FulfillmentCenter center: fc) {
//				center.setProduct(productInDb.get());
//				dataFulfillmentRepository.save(center);
//			}
//			
//		}
//		else {
			productDataRepository.save(product);
			
		//}
		
		
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

	
