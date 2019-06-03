package com.Rest.DataServiceLayer.DataServiceLayer.Exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -9168819376706250042L;
		
	public ProductNotFoundException(String message)
	{
		super(message);
		
	}

}
