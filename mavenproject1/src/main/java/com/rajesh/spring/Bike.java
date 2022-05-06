package com.rajesh.spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	
	public void ride() 
	   {
		 System.out.println("fast and safe ride ......... ");
	   }

	public void drive() {
		
		
	}

}
