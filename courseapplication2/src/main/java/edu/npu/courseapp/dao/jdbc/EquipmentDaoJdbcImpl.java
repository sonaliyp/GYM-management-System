package edu.npu.courseapp.dao.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import EquipmentServicesImpl.EquipmentRowMapper;
import edu.npu.courseapp.dao.EquipmentDao;
import edu.npu.courseapp.domain.Equipment;
import edu.npu.courseapp.domain.User;

@Repository("EquipmentDaoJdbcImpl")
public class EquipmentDaoJdbcImpl implements EquipmentDao {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate dbTemplate;
	private SimpleJdbcInsert jdbcInsert;
	private EquipmentRowMapper equipmentRowMapper;

	@PostConstruct
	public void setup() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	//	dbTemplate = new NamedParameterJdbcTemplate(dataSource);
		equipmentRowMapper = new EquipmentRowMapper();
	jdbcInsert = new SimpleJdbcInsert(dataSource)
				.withTableName("equipment").usingColumns("equipmentID ",
						"equipmentName ", "equipmentDetails ");
	}

	public void inserteqi(Equipment equipment) {
		/*
		 * int equipmentID; String name = equipment.getEquipmentName(); String
		 * det = equipment.getEquipmentDetails(); SqlParameterSource paramSource
		 * = new BeanPropertySqlParameterSource(equipment); Number newId =
		 * jdbcInsert.executeAndReturnKey(paramSource); equipmentID =
		 * newId.intValue(); equipment.setEquipmentID(equipmentID);
		 * equipment.setEquipmentName(name); equipment.setEquipmentDetails(det);
		 */
		int id = equipment.getEquipmentID();
		String name = equipment.getEquipmentName();
		String det = equipment.getEquipmentDetails();
		String sql = "Insert into equipment ( equipmentID ,  equipmentName ,equipmentDetails) values (?,?,?)";
		int row = jdbcTemplate.update(sql, id, name, det);
	}

	@Override
	public List<Equipment> getEquipmentList() {

		/*
		 * String sql = "SELECT * FROM equipment"; MapSqlParameterSource params
		 * = new MapSqlParameterSource(); List<Equipment> userlist =
		 * dbTemplate.query(sql,params, equipmentRowMapper); return userlist;
		 */
		String sql = "SELECT * FROM equipment";
		List<Equipment> EquipmentdbList = jdbcTemplate.query(sql,equipmentRowMapper);
		return EquipmentdbList;
	}

	@Override
	public void deleteone(Integer id) {
		// TODO Auto-generated method stub

		String SQL = "delete from equipment where equipmentID  = ?";
		jdbcTemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

}
