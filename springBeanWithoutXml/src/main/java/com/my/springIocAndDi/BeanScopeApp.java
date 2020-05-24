package com.my.springIocAndDi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("com.my.springIocAndDi")
public class BeanScopeApp 
{
    public static void main( String[] args )
    {
     //  Language language=new JavaLanguage();
       
    	//AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	AbstractApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
    	Language language1= context.getBean("javaLanguage",Language.class);
    	Language language2= context.getBean("javaLanguage",Language.class);
    	boolean b=language1==language2;
        System.out.println(b);
       
       
       context.close();
    }
}
