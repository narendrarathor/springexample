package com.my.springIocAndDi;

public class JavaLanguage implements Language {

	 Os os;
	 
	 
	 public JavaLanguage() {
		 
	 }
	
	//parameterized constructor 
	public JavaLanguage(Os os) {
		this.os=os;
	}
	
	public void setOs(Os os) {
		this.os=os;
	}
	
	public String getLanguage() {
		return 	"java language on...... "+os.getOsDetail();
	}

}