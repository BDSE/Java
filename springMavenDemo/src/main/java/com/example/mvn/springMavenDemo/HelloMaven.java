package com.example.mvn.springMavenDemo;

public class HelloMaven {

	private String userName;
	private long phoneNumber;

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void hello() {
		System.out.println("hello its spring using maven Mr:" + userName + " your name is coming from bean.xml file your phone number is: "+phoneNumber);
	}
}
