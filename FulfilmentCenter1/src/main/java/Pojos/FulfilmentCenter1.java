package Pojos;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class FulfilmentCenter1 {
	
	//@Value( "${fulfilmentCenterId}" )
	private Integer fulfilmentCenterId =21;
	@Id
	private Integer productId;
	private String  productName;
	private Integer inventoryNo;
	
	public FulfilmentCenter1() {
		
	}
	public FulfilmentCenter1(Integer fulfilmentCenterId, Integer productId, String productName, Integer inventoryNo) {
		super();
		this.fulfilmentCenterId = fulfilmentCenterId;
		this.productId = productId;
		this.inventoryNo = inventoryNo;
		this.productName= productName;
	}
	
	public Integer getfulfilmentCenterId() {
		return fulfilmentCenterId;
	}
	public void setfulfilmentCenterId(Integer fulfilmentCenterId) {
		this.fulfilmentCenterId = fulfilmentCenterId;
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	public Integer getInventoryNo() {
		return inventoryNo;
	}
	public void setInventoryNo(Integer inventoryNo) {
		this.inventoryNo = inventoryNo;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "FulfilmentCenter1 [fulfilmentCenterId=" + fulfilmentCenterId + ", productId=" + productId
				+ ", productName=" + productName + ", inventoryNo=" + inventoryNo + "]";
	}

	
	
}
