/**
 * this class performs general operations like update,delete,add,show on DB using Hibernate ORM. 
 */
package com.example;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentUtil {

	private static SessionFactory sessionFactory;

	public StudentUtil() {
		// getter method to get session factory, if the using for first time
		// then we
		// need to get from configuration, if already there then just grab it.

		if (sessionFactory == null) {
			Configuration configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
		}
	}

	public static void main(String[] args) {

		StudentUtil util = new StudentUtil();
		System.out.println("Hibernate up...SessionFactory created successfully....");

		StudentTableClass studentObj = new StudentTableClass("amar", "EE_Hibernate", "3.4");

		//util.save(studentObj);
		 //util.showAllRecords();

		/*try {
			util.updateRecord(3, "major", "MSCS");
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		util.deleteRecord(6);
	}

	public void save(StudentTableClass studentObj) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		s.persist(studentObj);
		tx.commit();
		s.close();

		System.out.println("Person record saved successfully....");
	}

	public void showAllRecords() {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();

		List personList = s.createQuery("From StudentTableClass").list();

		for (Iterator itr = personList.iterator(); itr.hasNext();) {
			StudentTableClass studentObj = (StudentTableClass) itr.next();
			studentObj.show();
		}
		tx.commit();
		s.close();
		/*
		 * for( Object p:personList){ Person p1 = (Person)p; p1.show(); }
		 */
	}

	public void updateRecord(int id, String columnname, String value) throws Exception {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();

		StudentTableClass studentObj = s.get(StudentTableClass.class, id);
		if (studentObj == null) {
			Exception e = new Exception("Id not found in the table");
			throw e;
		}
		studentObj.show();
		switch (columnname) {
		case "name":
			studentObj.setName(value);
			break;
		case "major":
			studentObj.setMajor(value);
			break;
		case "score":
			studentObj.setScore(value);
			break;
		}
		s.update(studentObj);
		tx.commit();
		s.close();
	}

	public void deleteRecord(int id) {
		Session s = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = s.beginTransaction();
			StudentTableClass p = s.get(StudentTableClass.class, id);
			if (p != null) {
				p.show();

				s.delete(p);
				System.out.println("record with id: " + id + " deleted successfully...");
			} else {
				System.out.println("id not found in db...");
			}
			tx.commit();
			s.close();
		} catch (HibernateException he) {
			he.printStackTrace();
		}

	}
}
