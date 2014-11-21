package edu.npu.courseapp.dao.jdbc;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import InstructorRowMapper.InstructorRowMapper;
import edu.npu.courseapp.dao.TimingDao;
import edu.npu.courseapp.domain.Instructor;
import edu.npu.courseapp.domain.Timings;
@Repository("TimingDaoJdbcImpl")
public class TimingDaoJdbcImpl implements TimingDao {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate dbTemplate;
	private SimpleJdbcInsert jdbcInsert;
	private TimingRowMapper timingRowMapper;

	@PostConstruct
	public void setup() {

		jdbcTemplate = new JdbcTemplate(dataSource);
		dbTemplate = new NamedParameterJdbcTemplate(dataSource);
		timingRowMapper = new TimingRowMapper();
		jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("timings").usingColumns("timeID", "instructorID", "timename");
		
	}

	@Override
	public List<Timings> getTimingsList() {
		String sql = "SELECT * FROM timings";
		List<Timings> TimeList = jdbcTemplate.query(sql,timingRowMapper);
		//System.out.println(InstructordbList);
		return TimeList;
	}

	@Override
	public void deleteAlltimings(Integer id) {
		String SQL = "delete from timings where instructorID  = ?";
		jdbcTemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
		
	}
}
