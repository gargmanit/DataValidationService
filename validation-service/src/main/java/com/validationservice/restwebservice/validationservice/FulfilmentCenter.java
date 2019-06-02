package com.validationservice.restwebservice.validationservice;

public class FulfilmentCenter {
	
	private Integer fulfilmentCenterId;
	private Integer InventoryNum;
	
	
	
	public FulfilmentCenter(Integer fulfilmentCenterId, Integer inventoryNum) {
		super();
		this.fulfilmentCenterId = fulfilmentCenterId;
		this.InventoryNum = inventoryNum;
	}
	public Integer getInventoryNum() {
		return InventoryNum;
	}
	public void setInventoryNum(Integer inventoryNum) {
		InventoryNum = inventoryNum;
	}
	
	public Integer getFulfilmentCenterId() {
		return fulfilmentCenterId;
	}
	

	public void setFulfilmentCenterId(Integer fulfilmentCenterId) {
		this.fulfilmentCenterId = fulfilmentCenterId;
	}
}
