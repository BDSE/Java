package com.examplews;

public class HelloService {
	
	public String sayHello(String name){
		return "Hello "+ name + "Welcome to SOAP Demo";
	}
	public String sumOfNumbers(int a, int b){
		return "sum of numbers id :"+(a+b);
	}

}
