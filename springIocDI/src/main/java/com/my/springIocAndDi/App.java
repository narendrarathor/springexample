package com.my.springIocAndDi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Inversion Control 
 *
 */
@ComponentScan(basePackages = {"com.my.springIocAndDi"})
public class App 
{
    public static void main( String[] args )
    {
     //  Language language=new JavaLanguage();
       
    	//AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	/*
    	 *Anotation based 
    	 * */
    	
    	AbstractApplicationContext context=new AnnotationConfigApplicationContext(App.class);
    	
    	Language language= context.getBean("phpLanguage",Language.class);
    	String strlng=language.getLanguage();
       
       System.out.println("Language-->"+strlng);
       
       context.close();
    }
}
