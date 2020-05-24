package com.my.springIocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class JavaLanguage implements Language {

	 Os os;
	 public JavaLanguage() {		 
	 }
	

	 @Autowired
	
	public JavaLanguage( @Qualifier("macOs")Os os) {
		this.os=os;
	}
	
//	 @Autowired
//	 @Qualifier("macOs")
//	public void setOs(Os os) {
//		this.os=os;
//	}
	
	public String getLanguage() {
		return 	"java language on...... "+os.getOsDetail();
	}

}