package com.nttdata.bootcamp.library.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.library.age.Adult;

@Configuration
@ConditionalOnClass(Adult.class)
@EnableConfigurationProperties(AdultProperties.class)
public class AdultAutoconfigure {
	
	private final AdultProperties properties;
	
	public AdultAutoconfigure( AdultProperties adultProperties ) {
		this.properties = adultProperties;
	}
	
	@Bean
	public Adult adult() {
		return new Adult( properties.getAge() );
	}

}
