package com.example.dependencyinjection;

public class FactoryClass {
	
	public FactoryClass() {
		System.out.println("factory class constructor called");
	}
	
	public Person personFactory(String name, Address addr){
		System.out.println("from factory class...making bean person1");
		return new Person(name, addr);
	}

}
