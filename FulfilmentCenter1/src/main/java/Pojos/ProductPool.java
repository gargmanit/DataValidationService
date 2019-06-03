package Pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


public class ProductPool {
	
	private Integer productId;
	private String productName;
	
	private List<FulfilmentCenter> fulfilmentCenter;
	
	
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
