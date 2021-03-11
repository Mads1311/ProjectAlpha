package com.annotationexample.forScan;

import org.springframework.stereotype.Component;

@Component
public class ComponentScantest {
	public String hello()
	{
		System.out.println("Hello");
		return "Using component scan";
	}
	

}
