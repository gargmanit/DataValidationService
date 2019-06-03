package com.RestService.DataserviceLayer.DataServiceLayer;

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
	@OneToMany( cascade=CascadeType.ALL)
	@JoinColumn(name="productId")
	private List<FulfillmentCenter>  fulfillmentCenter;
	
	public ProductPool() {
	}
	
	public ProductPool(Integer productId, String productName, List<FulfillmentCenter> fulfillmentCenter) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.fulfillmentCenter = fulfillmentCenter;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public void setFulfillmentCenter(List<FulfillmentCenter> fulfillmentCenter) {
		this.fulfillmentCenter = fulfillmentCenter;
	}


	public Integer getproductId() {
		return productId;
	}


	public String getproductName() {
		return productName;
	}


	public List<FulfillmentCenter> getFulfillmentCenter() {
		return fulfillmentCenter;
	}


	@Override
	public String toString() {
		return "ProductPool [productId=" + productId + ", productName=" + productName + ", fulfillmentCenter="
				+ fulfillmentCenter + "]";
	}
	
	
}
