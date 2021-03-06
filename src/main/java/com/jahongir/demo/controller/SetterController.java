package com.jahongir.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.jahongir.demo.services.MyService;

@Controller
public class SetterController {

	
	private MyService myService;

	@Autowired
	@Qualifier("setterImplementation")
	public void setMyService( MyService myService) {
		this.myService = myService;
	} 
	
	public MyService getMyService() {
		return myService;
	}
	
}
