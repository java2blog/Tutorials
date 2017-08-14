package org.arpit.java2blog.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Value("${countryName}")
	private String countryName;
	
	public Country()
	{
		
	}
	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
