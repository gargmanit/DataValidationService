package com.RestService.DataserviceLayer.DataServiceLayer;




public class ProductNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8154624938998187399L;
	public ProductNotFoundException(String message)
	{ 
		super(message);
	}

}


