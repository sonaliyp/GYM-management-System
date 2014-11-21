package edu.npu.courseapp.dao.jdbc;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import InstructorRowMapper.InstructorRowMapper;
import edu.npu.courseapp.dao.InstructorDao;
import edu.npu.courseapp.domain.Instructor;

@Repository("InstructorDaoJdbcImpl")
public class InstructorDaoJdbcImpl implements InstructorDao {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate dbTemplate;
	private SimpleJdbcInsert jdbcInsert;
	private InstructorRowMapper instructorRowMapper;

	@PostConstruct
	public void setup() {
		jdbcTemplate = new JdbcTemplate(dataSource);
		dbTemplate = new NamedParameterJdbcTemplate(dataSource);
		instructorRowMapper = new InstructorRowMapper();
		jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("instructor").usingColumns("instructorID", "timeID", "instructorName", "instructorAddress", "instructorCInfo", "price", "instructorExp");
		
	}

	@Override
	public List<Instructor> getInstructorList() {
		String sql = "SELECT * FROM instructor";
		List<Instructor> InstructordbList = jdbcTemplate.query(sql,instructorRowMapper);
		//System.out.println(InstructordbList);
		return InstructordbList;
		
		
	}

	@Override
	public void deleteInstr(Integer id) {
		String SQL = "DELETE FROM instructor WHERE instructorID = ?";
		jdbcTemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
		
	}

}
