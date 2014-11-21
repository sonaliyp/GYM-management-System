package edu.npu.courseapp.domain;

public class Instructor {
	public Instructor(){}
	public Instructor(int instructorID, int timeID, String instructorName,
			String instructorAddress, String instructorCInfo, int price,
			String instructorExp) {
		
		this.instructorID = instructorID;
		this.timeID = timeID;
		this.instructorName = instructorName;
		this.instructorAddress = instructorAddress;
		this.instructorCInfo = instructorCInfo;
		this.price = price;
		this.instructorExp = instructorExp;
	}
	@Override
	public String toString() {
		return "Instructor [instructorID=" + instructorID + ", timeID="
				+ timeID + ", instructorName=" + instructorName
				+ ", instructorAddress=" + instructorAddress
				+ ", instructorCInfo=" + instructorCInfo + ", price=" + price
				+ ", instructorExp=" + instructorExp + "]";
	}
	public int getInstructorID() {
		return instructorID;
	}
	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}
	public int getTimeID() {
		return timeID;
	}
	public void setTimeID(int timeID) {
		this.timeID = timeID;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getInstructorAddress() {
		return instructorAddress;
	}
	public void setInstructorAddress(String instructorAddress) {
		this.instructorAddress = instructorAddress;
	}
	public String getInstructorCInfo() {
		return instructorCInfo;
	}
	public void setInstructorCInfo(String instructorCInfo) {
		this.instructorCInfo = instructorCInfo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInstructorExp() {
		return instructorExp;
	}
	public void setInstructorExp(String string) {
		this.instructorExp = string;
	}
	int  instructorID;
	int  timeID ;
	String  instructorName; 
	String instructorAddress;
	String instructorCInfo;
	int price;
	String instructorExp;
}
