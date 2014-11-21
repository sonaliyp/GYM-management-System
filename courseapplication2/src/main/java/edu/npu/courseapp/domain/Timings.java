package edu.npu.courseapp.domain;
import java.util.ArrayList;

import edu.npu.courseapp.domain.Instructor;
public class Timings {
	private String timename;
     public String getTimename() {
		return timename;
	}
     public Timings(){}
	public void setTimename(String timename) {
		this.timename = timename;
	}
	public int getInstructorID() {
		return instructorID;
	}
	public Timings(String timename, int instructorID, int timeID) {

		this.timename = timename;
		this.instructorID = instructorID;
		this.timeID = timeID;
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
	int instructorID;
     int timeID;
	
}