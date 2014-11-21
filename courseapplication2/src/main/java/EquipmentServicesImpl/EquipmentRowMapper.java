package EquipmentServicesImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.npu.courseapp.domain.Equipment;

public class EquipmentRowMapper implements RowMapper<Equipment> {
	public Equipment mapRow(ResultSet rs, int row) throws SQLException {
		int equipmentID;
		String equipmentName;
		String equipmentDetails;
		equipmentID = rs.getInt("equipmentID");
		equipmentName = rs.getString("equipmentName");
		equipmentDetails = rs.getString("equipmentDetails");
		Equipment eq = new Equipment(equipmentID,equipmentName, equipmentDetails);
		eq.setEquipmentID(equipmentID);
		eq.setEquipmentDetails(rs.getString("equipmentDetails"));
		eq.setEquipmentName(rs.getString("equipmentName"));
		return eq;
	}
}
