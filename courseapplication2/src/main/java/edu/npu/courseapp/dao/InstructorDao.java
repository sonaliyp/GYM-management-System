package edu.npu.courseapp.dao;

import java.util.List;

import edu.npu.courseapp.domain.Instructor;



public interface InstructorDao {
	public List<Instructor> getInstructorList();
	public void deleteInstr(Integer id);
}
