package com.my.springIocAndDi;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class PhpLanguage implements Language {
	
	/* init method */
	public void initDatabase() {
		System.out.println( "database is open the connection");
	}
	
	public void destroyDatabase() {
		System.out.println( "database is closed");
	}
	
	public String getLanguage() {
		return "PHP Language";
	}

}
