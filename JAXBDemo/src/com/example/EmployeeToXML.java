package com.example;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class EmployeeToXML {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);

			Marshaller marshellerObj = context.createMarshaller();
			marshellerObj.setProperty(marshellerObj.JAXB_FORMATTED_OUTPUT, true);

			Employee employee = new Employee(100, "Amarsandhu", 12000.0f);
			marshellerObj.marshal(employee, new FileOutputStream("employee.xml"));
			System.out.println("xml file from object created....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
