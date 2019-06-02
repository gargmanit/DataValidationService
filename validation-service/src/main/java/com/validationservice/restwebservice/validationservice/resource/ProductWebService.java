package com.validationservice.restwebservice.validationservice.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.validationservice.restwebservice.validationservice.Product;
import com.validationservice.restwebservice.validationservice.DAO.ProductDao;

@RestController
public class ProductWebService {

	@Autowired
	ProductDao productdao;
	
	@GetMapping("/products")
	public List<Product> getAllResources() {
		return productdao.getProductAll();
	}
	
	@GetMapping("/products/{id}")
	public Product getResource(@PathVariable int id) {
		Product p = productdao.getProduct(id);
		if(p==null)
			 throw new ProductNotFoundException("id-"+id);
		return p;
	}
	
	
	@PostMapping("/products")
	public ResponseEntity<Object> addResource(@RequestBody Product product ) {
		 Product newproduct = productdao.addProduct(product);
		 
		 URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(newproduct.getProductId()).toUri();
			return ResponseEntity.created(location).build();
		
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteResource(@PathVariable int id) {
		Product p = productdao.deleteProduct(id);
		if(p==null)
			 throw new ProductNotFoundException("id-"+id);
		}
	
	
}
