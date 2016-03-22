package com.example.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/example/dependencyinjection/beans.xml");
		
		Person p = (Person)context.getBean("person");
		Person p1 = (Person)context.getBean("person1");
		
		System.out.println("Person 1: "+p.toString()+" Person 2: "+ p1.toString());
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
