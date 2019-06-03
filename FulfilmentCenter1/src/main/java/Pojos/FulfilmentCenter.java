package Pojos;


public class FulfilmentCenter {

	private Integer fulfilmentid;
	private Integer inventoryNo;
	
	
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
	
	@Override
	public String toString() {
		return "FulfilmentCenter [fulfilmentid=" + fulfilmentid + ", inventoryNo=" + inventoryNo + "]";
	}
	
	
}
