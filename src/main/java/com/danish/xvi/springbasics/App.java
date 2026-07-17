package com.danish.xvi.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// Initializes the Spring container by reading the configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Asks the container for the bean named "developer" (defined in xml)
		// We cast it to Developer because getBean returns an Object
		Developer dev = (Developer) context.getBean("developer");

		// Uses the bean provided by Spring
		dev.coding();
		
		// Closes the Spring container
		((ClassPathXmlApplicationContext) context).close();
	}
}