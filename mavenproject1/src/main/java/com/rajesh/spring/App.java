package com.rajesh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	
        Vehicle obj = (Car)context.getBean("vehicle");
        Vehicle obj2 = (Bike)context.getBean("vehicle2");
    
        obj.drive();
        obj2.ride();
        
    }
}
 