package com.my.springIocAndDi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = {"classpath:os.properties"})
@Component
public class WindowOs implements Os {
	@Value("${os.windowsname}")
	String name;
	@Value("${os.windowsversion}")
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
