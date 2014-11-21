package edu.npu.courseapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.npu.courseapp.dao.InstructorDao;
import edu.npu.courseapp.domain.Instructor;

@Transactional(rollbackFor={java.io.IOException.class},noRollbackFor = ArithmeticException.class)
@Service
public class InstructorServicesImpl implements InstructorServices{
	@Autowired
	@Qualifier("InstructorDaoJdbcImpl")
	private InstructorDao  InstructorDao;

	@Override
	public List<Instructor> getintList() {
		List<Instructor> eqli = InstructorDao.getInstructorList();
		System.out.println(eqli);
		return eqli;	
	}

	@Override
	public void deleteIns(Integer id) {
		
		InstructorDao.deleteInstr(id);
	}

}
