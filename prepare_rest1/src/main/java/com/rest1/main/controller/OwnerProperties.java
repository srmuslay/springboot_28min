package com.rest1.main.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


//@ConfigurationProperties(prefix="acme.my-project.person")
@Component
@ConfigurationProperties("basic")
public class OwnerProperties {
	private boolean value;
	private String firstName;

	public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}