package com.annotationexample.Variousannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.annotationexample.Variousannotations","com.annotationexample.forScan"})
@SpringBootApplication
public class VariousannotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VariousannotationsApplication.class, args);
	}

}
