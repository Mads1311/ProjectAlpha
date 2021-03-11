package com.annotationexample.Variousannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotationexample.forScan.ComponentScantest;

@RestController
public class VariousAnnotationController {

	@Value("${location:Not found}")
	String loc;
	@Autowired
	private VariousAnnotationService vas;
	
	@Autowired
	private ComponentScantest cst;

	@RequestMapping("/getmessage")

	public String getMessage() {
		return "Hi,I am in controller";
	}

	@RequestMapping("/getname")

	public String getname() {
		return vas.getname() + "  Location is " + loc;
	}
	
	@RequestMapping("/getcomp")

		public String getcompscan()
		{
			return cst.hello();
		}
	}

