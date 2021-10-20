package com.nttdata.bootcamp.library.age;

public class Adult {
	
	private int age;
	
	private final int ADULT_AGE = 18;
	
	public Adult( final int age ) {
		this.age = age;
	}
	
	public String getMessage() {
		return age >= ADULT_AGE ? "Eres mayor de edad" : "Eres menor de edad. Vuelve cuando crezcas.";
	}
	
}
