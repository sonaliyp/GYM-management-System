package edu.npu.courseapp.dao;

import java.util.List;

import edu.npu.courseapp.domain.Equipment;

public interface EquipmentDao {
	public void inserteqi(Equipment eqi);
	public List<Equipment> getEquipmentList();
	public void deleteone(Integer id);
}
