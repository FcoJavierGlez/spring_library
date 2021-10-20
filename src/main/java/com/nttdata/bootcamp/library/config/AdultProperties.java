package com.nttdata.bootcamp.library.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("adult.age")
public class AdultProperties {
	
	private int age = 18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
