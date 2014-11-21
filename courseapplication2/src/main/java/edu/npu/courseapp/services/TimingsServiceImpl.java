package edu.npu.courseapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.npu.courseapp.dao.EquipmentDao;
import edu.npu.courseapp.dao.TimingDao;
import edu.npu.courseapp.domain.Equipment;
import edu.npu.courseapp.domain.Timings;
@Transactional(rollbackFor={java.io.IOException.class},noRollbackFor = ArithmeticException.class)
@Service
public class TimingsServiceImpl implements TimingService{
	@Autowired
	@Qualifier("TimingDaoJdbcImpl")
	private TimingDao timingdao;
	@Override
	public ArrayList<Timings> getTimingsInstructor(String courseName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Timings> gettimingsList() {
		List<Timings> eqli = timingdao.getTimingsList();
		return eqli;
	}

	@Override
	public void deleteTiming(Integer id) {
		// TODO Auto-generated method stub
		timingdao.deleteAlltimings(id);
	}

}
