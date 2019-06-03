package com.Rest.DataServiceLayer.DataServiceLayer.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ProductPool {
	
	@Id
	private Integer productId;
	private String productName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="productId")
	private List<FulfilmentCenter> fulfilmentCenter;
	
	public ProductPool() {
	}

	public ProductPool(Integer productId, String productName, List<FulfilmentCenter> fulfilmentCenter) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.fulfilmentCenter = fulfilmentCenter;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<FulfilmentCenter> getFulfilmentCenter() {
		return fulfilmentCenter;
	}

	public void setFulfilmentCenter(List<FulfilmentCenter> fulfilmentCenter) {
		this.fulfilmentCenter = fulfilmentCenter;
	}

	@Override
	public String toString() {
		return "ProductPool [productId=" + productId + ", productName=" + productName + ", fulfilmentCenter="
				+ fulfilmentCenter + "]";
	}
	
	

	

	
}
