package edu.npu.courseapp.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.npu.courseapp.domain.Timings;

public class TimingRowMapper implements RowMapper<Timings>{

	@Override
	public Timings mapRow(ResultSet rs, int rowNum) throws SQLException {
		int timeID;
		int instructorID;
		String timename;
		timeID = rs.getInt("timeID");
		instructorID = rs.getInt("instructorID");
		timename = rs.getString("timename");
		Timings t1 = new Timings( timename,  instructorID,  timeID);
		t1.setTimeID(rs.getInt("timeID"));
		t1.setInstructorID(rs.getInt("instructorID"));
		t1.setTimename(rs.getString("timename"));
		return t1;
	}

}
