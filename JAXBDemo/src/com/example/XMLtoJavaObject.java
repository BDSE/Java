package com.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XMLtoJavaObject {
	
	public static void main(String[] args) {
		try{
			File fileObj = new File("employee.xml");
			
			JAXBContext jsxbContext = JAXBContext.newInstance(Employee.class);
			
			Unmarshaller unmarshellerObj = jsxbContext.createUnmarshaller();
			
			Employee emp = (Employee) unmarshellerObj.unmarshal(fileObj);
			
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
			System.out.println(Employee.class);
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
}
