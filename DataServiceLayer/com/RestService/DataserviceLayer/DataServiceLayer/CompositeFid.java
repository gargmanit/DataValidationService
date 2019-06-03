package com.RestService.DataserviceLayer.DataServiceLayer;
//package com.RestService.DataserviceLayer.DataServiceLayer;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//import javax.persistence.Embeddable;
////@Embeddable
//public class CompositeFid implements Serializable {
//
//	private static final long serialVersionUID = -9190615577108721042L;
//	private Integer fulfillmentId;
//	private Integer product_Id;
//	public CompositeFid(Integer fulfillmentId, Integer product_Id) {
//		super();
//		this.fulfillmentId = fulfillmentId;
//		this.product_Id = product_Id;
//	}
//	public Integer getFulfillmentId() {
//		return fulfillmentId;
//	}
//	public Integer getproduct_Id() {
//		return product_Id;
//	}
//	
//	@Override
//	public boolean equals(Object o) {
//				
//			if(this==o) return true;
//			if (o == null || getClass() != o.getClass()) return false;
//			CompositeFid compositeFId = (CompositeFid) o;
//		      if (fulfillmentId.equals(compositeFId.getFulfillmentId()) && product_Id.equals(compositeFId.getproduct_Id())) 
//		    	  return true;
//		      
//		      return false;
//		  }
//
//		  @Override
//		  public int hashCode() {
//		      return Objects.hash(fulfillmentId,product_Id);
//		  }
//		
//		
//	}
//	
//
//
