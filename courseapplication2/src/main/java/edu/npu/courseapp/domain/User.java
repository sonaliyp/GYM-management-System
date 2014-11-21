package edu.npu.courseapp.domain;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@Email
	String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	
	public User(){
		
	}
	public User(String emailAddress, int userID, String password,
			String firstName, String lastName, String city, String state,
			String country, int isAdmin) {
	
		this.emailAddress = emailAddress;
		this.userID = userID;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "User [emailAddress=" + emailAddress + ", userID=" + userID
				+ ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", city=" + city + ", state="
				+ state + ", country=" + country + ", isAdmin=" + isAdmin + "]";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	//auto increment 
	int userID;
	@Size
	(min=3,max=15)
	String password;
	@NotEmpty
	String firstName;
	@NotEmpty
	String lastName;
	String city;
	String state;
	String country;
	
	int isAdmin;
}
