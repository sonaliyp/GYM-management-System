package edu.npu.courseapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.npu.courseapp.dao.EquipmentDao;
import edu.npu.courseapp.domain.Equipment;
import edu.npu.courseapp.domain.User;


@Transactional(rollbackFor={java.io.IOException.class},noRollbackFor = ArithmeticException.class)
@Service
public class EquipmentServiceImpl implements EquipmentService {

@Autowired
@Qualifier("EquipmentDaoJdbcImpl")
	private EquipmentDao eqipmentdao;
private static ArrayList<Equipment> equipmentList;
	@Override
	public void addNewEqu(Equipment equ) {

		eqipmentdao.inserteqi(equ);
	}
	@Override
	public List<Equipment> getEquList() {
		List<Equipment> eqli = eqipmentdao.getEquipmentList();
		return eqli;
	}
	@Override
	public void deleteEqu(Integer id) {
		// TODO Auto-generated method stub
		eqipmentdao.deleteone(id);
		
	}

}
