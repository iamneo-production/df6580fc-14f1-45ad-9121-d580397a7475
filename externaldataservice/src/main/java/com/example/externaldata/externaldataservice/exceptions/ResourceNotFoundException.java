package com.example.externaldata.externaldataservice.exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(String str) {
		super(str);
	}
	
	public ResourceNotFoundException() {
		super("Resource Not Found!!");
	}
}
