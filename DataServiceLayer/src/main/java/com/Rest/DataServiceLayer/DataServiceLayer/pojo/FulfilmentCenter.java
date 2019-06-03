package com.Rest.DataServiceLayer.DataServiceLayer.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FulfilmentCenter {

	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer fulfilmentid;
	private Integer inventoryNo;
	@ManyToOne
	private ProductPool productpool;
	
	public FulfilmentCenter() {
		
	}
	
	public FulfilmentCenter(Integer fulfilmentid, Integer inventoryNo, ProductPool productpool) {
		super();
		this.fulfilmentid = fulfilmentid;
		this.inventoryNo = inventoryNo;
		this.productpool = productpool;
	}
	
	
	public Integer getFulfilmentid() {
		return fulfilmentid;
	}
	public void setFulfilmentid(Integer fulfilmentid) {
		this.fulfilmentid = fulfilmentid;
	}
	public Integer getInventoryNo() {
		return inventoryNo;
	}
	public void setInventoryNo(Integer inventoryNo) {
		this.inventoryNo = inventoryNo;
	}
	public ProductPool getProductpool() {
		return productpool;
	}
	public void setProductpool(ProductPool productpool) {
		this.productpool = productpool;
	}
	@Override
	public String toString() {
		return "FulfilmentCenter [fulfilmentid=" + fulfilmentid + ", inventoryNo=" + inventoryNo + "]";
	}
	
	
}
