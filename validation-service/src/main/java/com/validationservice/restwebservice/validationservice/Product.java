//package com.validationservice.restwebservice.validationservice;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="ProductTable")
//public class Product {
//	@Id
//	@GeneratedValue
//	private Integer productId ;
//	private String productName;
//	private List<FulfilmentCenter> fulfilmentCenter;
//	
//	
//	Product(){
//		
//	}
//	public Product(Integer productId, String productName, List<FulfilmentCenter> fulfilmentCenter) {
//		super();
//		this.productId = productId;
//		this.productName = productName;
//		this.fulfilmentCenter = fulfilmentCenter;
//	}
//	public void setProductId(Integer productId) {
//		this.productId = productId;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	
//	public void setFulfilmentCenter(List<FulfilmentCenter> fulfilmentCenter) {
//		this.fulfilmentCenter = fulfilmentCenter;
//	}
//	public Integer getProductId() {
//		return productId;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	
//	public List<FulfilmentCenter> getFulfilmentCenter() {
//		return fulfilmentCenter;
//	}
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", productName=" + productName + ", fulfilmentCenter="
//				+ fulfilmentCenter + "]";
//	}
//	
//	
//}
//
