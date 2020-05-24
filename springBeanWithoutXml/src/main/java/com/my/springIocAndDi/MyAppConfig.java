package com.my.springIocAndDi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.my.springIocAndDi")

public class MyAppConfig {
	
	@Bean
	public Os macOs() {
		return new MacOs();
	}
	@Bean 
	@Scope("prototype")
	public Language javaLanguage() {
		return new JavaLanguage(macOs());
	}

}
