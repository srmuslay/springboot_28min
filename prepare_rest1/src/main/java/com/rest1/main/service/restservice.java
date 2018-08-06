package com.rest1.main.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class restservice {

	public boolean validateUser(String user, String pwd) {
		
		if(pwd.equalsIgnoreCase("11111"))
			return true;
		
		return false;
	}
}
