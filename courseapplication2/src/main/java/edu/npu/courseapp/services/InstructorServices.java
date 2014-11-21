package edu.npu.courseapp.services;
import edu.npu.courseapp.domain.Instructor;

import java.util.List;


public interface InstructorServices {
	public List<Instructor> getintList();
	public void deleteIns(Integer id);
}
