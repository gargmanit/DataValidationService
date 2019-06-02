package com.validationservice.restwebservice.validationservice.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.validationservice.restwebservice.validationservice.FulfilmentCenter;
import com.validationservice.restwebservice.validationservice.Product;

@Component
public class ProductDao {
	
	static List<Product> products = new ArrayList<>();
	
	static 
	{
	FulfilmentCenter f1 = new FulfilmentCenter(20,5);
	FulfilmentCenter f2 = new FulfilmentCenter(21,4);
	FulfilmentCenter f3 = new FulfilmentCenter(22,5);
	FulfilmentCenter f4 = new FulfilmentCenter(23,7);
	
	List<FulfilmentCenter> centerslist = new ArrayList<>();
	
	centerslist.add(f1);
	centerslist.add(f2);
	centerslist.add(f3);
	centerslist.add(f4);
	
	
	products.add(new Product(1,"table",centerslist));
	products.add(new Product(2,"chair",centerslist));
	products.add(new Product(3,"tv",centerslist));
	
	
	}	
	
	public List<Product> getProductAll() {
	
		return products;
	}
	
	public Product getProduct(int Productid) {
		for(Product p  :products) {
			if(p.getProductId()==Productid)
				return p;
		}
		return null;
	}
	
	public Product addProduct(Product p) {
		products.add(p);
		
		return p;
	}
	
	
	public Product deleteProduct(int id) {
		for(Product p:products) {
			if(p.getProductId()==id) {
				products.remove(p);
				return p;
			}
		}
		return null	;	
	}
		
	}

