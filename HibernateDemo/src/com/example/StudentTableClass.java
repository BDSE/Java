/**
 * this class corresponds to the Student table of database
 * this class uses annotations unlike the person class which uses the Person.hbn.xml to map
 */
package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentTableClass {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	// we can skip annotations if the variable name is same as the column name
	private String name;
	private String major;

	@Column(name = "gpa")
	private String score;

	public StudentTableClass(String name, String major, String score) {
		this.name = name;
		this.major = major;
		this.score = score;
	}
	public StudentTableClass(){
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	void show(){
		System.out.println(id+" : "+name+" : "+major+" : "+score);
	}
}
