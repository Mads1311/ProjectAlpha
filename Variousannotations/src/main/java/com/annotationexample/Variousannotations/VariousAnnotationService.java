package com.annotationexample.Variousannotations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class VariousAnnotationService {

	public VariousAnnotationService() {
		System.out.println("Service Layer is Created");

	}
	
	public String getname()
	{
		return "Madhuri";
	}
	
	

}
