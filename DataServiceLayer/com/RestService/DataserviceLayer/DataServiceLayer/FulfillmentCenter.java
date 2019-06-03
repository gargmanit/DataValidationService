package com.RestService.DataserviceLayer.DataServiceLayer;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;


//@IdClass(CompositeFId.class)
@Entity
public class FulfillmentCenter{

	
	@Id
	@GeneratedValue
	private Integer id;
//	@EmbeddedId
//	private CompositeFid compositeFid;
	private Integer inventoryNo ;
	private Integer fulfillmentId;
	private Integer productid;

	@ManyToOne
	//s@MapsId("producId")
	@JoinColumn(name="productId",insertable=false,updatable=false)
  	private ProductPool product;
	
	public FulfillmentCenter() {
		}
	
	public FulfillmentCenter(Integer id, Integer inventoryNo, Integer fulfillmentId, ProductPool product) {
		super();
		this.id = id;
		this.inventoryNo = inventoryNo;
		this.fulfillmentId = fulfillmentId;
		this.product = product;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getInventoryNo() {
		return inventoryNo;
	}
	public void setInventoryNo(Integer inventoryNo) {
		this.inventoryNo = inventoryNo;
	}
	public Integer getFulfillmentId() {
		return fulfillmentId;
	}
	public void setFulfillmentId(Integer fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}
	
	@Override
	public String toString() {
		return "FulfillmentCenter [id=" + id + ", inventoryNo=" + inventoryNo + ", fulfillmentId=" + fulfillmentId
				+ "]";
	}
	
	
}
