package edu.npu.courseapp.services;

import java.util.ArrayList;
import java.util.List;

import edu.npu.courseapp.domain.Equipment;



public interface EquipmentService {
	public void addNewEqu(Equipment equ);
	public List<Equipment> getEquList();
	public void deleteEqu(Integer id);
}
