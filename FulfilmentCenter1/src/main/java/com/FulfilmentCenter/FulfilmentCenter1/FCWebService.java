package com.FulfilmentCenter.FulfilmentCenter1;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.FulfilmentCenter.FulfilmentCenter1.Repository.FCDataRepository;

import Pojos.FulfilmentCenter1;


@RestController
public class FCWebService {

	
	@Autowired
	private FCDataRepository fCDataRepository;
	
	private PublishToDataLayer publishToDataLayer = new PublishToDataLayer();
	
	
	@PostMapping("/products")
	public void saveProduct (@RequestBody FulfilmentCenter1 fcproduct)
	{
		fCDataRepository.save(fcproduct);
		
		try {
			publishToDataLayer.publishJson(publishToDataLayer.getProductPool(fcproduct));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
		
		@GetMapping("/products/{id}")
	public Optional<FulfilmentCenter1> getProductService(@PathVariable Integer id) {
		
		  Optional<FulfilmentCenter1> fcProductEntry = fCDataRepository.findById(id);
		  if (!fcProductEntry.isPresent())
			  throw new ProductNotFoundException("id: "+id);
		  
		  return fcProductEntry;
	}
		
	
	@GetMapping("/products")
	public List<FulfilmentCenter1> getAllProducts() {
		return fCDataRepository.findAll();
	}
	
	

		
	}

