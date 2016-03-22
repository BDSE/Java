package com.example.mvn.springMavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/mvn/springMavenDemo/beans.xml");
		
		HelloMaven hm = (HelloMaven)context.getBean("person");
		
		hm.hello();
		
		//this will close anyways when program quits...dont have to use this.
		((ClassPathXmlApplicationContext)context).close();
		
	}
	
}
