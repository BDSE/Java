package com.example.dependencyinjection;

public class Person {

	private String name;
	private Address addr;

	public Person(String name, Address addr){
		this.name = name;
		this.addr = addr;
		System.out.println("From person constructor...making bean person");
	}
	public Person(){
		System.out.println("creating bean from default constructor");
	}
	public static Person getInstanceFactory(String name, Address addr){
		System.out.println("from person factory");
		return new Person(name, addr);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}

}
