package edu.npu.courseapp.services;

import java.util.ArrayList;
import java.util.List;

import edu.npu.courseapp.domain.Equipment;
import edu.npu.courseapp.domain.Instructor;
import edu.npu.courseapp.domain.Timings;

public interface TimingService {
	public ArrayList<Timings> getTimingsInstructor(String courseName);
	public List<Timings> gettimingsList();
	public void deleteTiming(Integer id);
}
