package com.FulfilmentCenter.FulfilmentCenter1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import org.springframework.web.client.RestTemplate;

import Pojos.FulfilmentCenter;
import Pojos.FulfilmentCenter1;
import Pojos.ProductPool;


public class PublishToDataLayer {

	private static final Logger log = LoggerFactory.getLogger(PublishToDataLayer.class);
	RestTemplate restTemplate = new RestTemplate();
	final String baseUrl = "http://localhost:8090/products";
	
		
	public ResponseEntity<String> publishJson(ProductPool product) throws URISyntaxException{
		  URI uri = new URI(baseUrl);
		  HttpEntity<ProductPool> request = new HttpEntity<>(product);
		ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
		log.info(result.getStatusCodeValue()+"");
		return result;
	
}


	public ProductPool getProductPool (FulfilmentCenter1 fcproduct) {
					
		ProductPool product = new ProductPool();
		FulfilmentCenter fc = new FulfilmentCenter();
		List<FulfilmentCenter> list = new ArrayList<>();
		
		product.setProductId(fcproduct.getProductId());
		product.setProductName(fcproduct.getProductName());
		fc.setFulfilmentid(fcproduct.getfulfilmentCenterId());	
		fc.setInventoryNo(fcproduct.getInventoryNo());
		
		list.add(fc);
		product.setFulfilmentCenter(list);
		
		return product;
	}

}
//
//public static void main(String[] args) {
//	//SpringApplication.run(Valida tionServiceApplication.class, args);
//
//	RestTemplate restTemplate = new RestTemplate();
//	Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//	log.info(quote.toString());