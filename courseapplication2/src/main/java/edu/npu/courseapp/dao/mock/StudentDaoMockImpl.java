package edu.npu.courseapp.dao.mock;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import edu.npu.courseapp.dao.StudentDao;
import edu.npu.courseapp.domain.Student;

@Repository("StudentDaoMockImpl")
public class StudentDaoMockImpl implements StudentDao {
	private ArrayList<Student> studList;
	static int idCnt = 1;

	@PostConstruct
	private void initData() {
		studList = new ArrayList<Student>();
	}

	public void insertStudent(Student stud) {
		studList.add(stud);
		/* Simulate getting back the primary id from the database */
		stud.setId(idCnt);
		idCnt++;
	}

}
