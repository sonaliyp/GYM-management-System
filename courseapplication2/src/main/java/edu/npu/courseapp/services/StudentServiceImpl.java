package edu.npu.courseapp.services;

import java.util.ArrayList;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.npu.courseapp.dao.StudentDao;
import edu.npu.courseapp.domain.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	@Qualifier("StudentDaoJdbcImpl")
	private StudentDao studentDao;
	
	@Transactional
	public void addNewStudent(Student stud) {
		studentDao.insertStudent(stud);
	}

}
