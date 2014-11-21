package edu.npu.courseapp.domain;

import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Student {
	private long id;
	@Size(min=2, max=30)
	private String lastName;
	@NotEmpty
	private String firstName;
	@Range(min=18, max=90)
	int age;
	private Gender gender;
	
	public Student() {
	}
	
	public Student(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public Gender getGender() {
		return gender;
	}

	public String toString() {
		String studStr = "Student[" + firstName + " " + lastName + "  gender: " + gender + "]";
		return studStr;
	}
	
	public boolean equals(Object otherObj) {
		Student otherStud;
		
		if (!(otherObj instanceof Student)) return false;
		otherStud = (Student) otherObj;
		return (id == otherStud.id && lastName.equals(otherStud.lastName) && firstName.equals(otherStud.firstName));
	}
}
