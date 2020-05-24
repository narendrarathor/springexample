package com.my.springIocAndDi;

public class Os {
	
	String name;
	String version;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOsDetail() {
		return "[ OS Name-"+ name +" Version-"+version +"]";
	}
	
	public String toString() {
		return "[ OS Name-"+ name +" Version-"+version +"]";
	}

}
