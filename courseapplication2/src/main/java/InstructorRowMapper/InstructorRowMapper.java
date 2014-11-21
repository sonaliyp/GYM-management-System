/*package InstructorRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.npu.courseapp.domain.Instructor;

public class InstructorRowMapper implements RowMapper<Instructor> {

	@Override
	public Instructor mapRow(ResultSet rs1, int rowNum) throws SQLException {
		
		int instructorID;
		String instructorName;
		int timeID ;
		String instructorAddress;
		String instructorCInfo;
		int price = 0;
		String instructorExp;
		

		instructorID = rs1.getInt("instructorID");
		instructorName = rs1.getString("instructorName");
		timeID = rs1.getInt("timeID");
		instructorAddress = rs1.getString("instructorAddress");
		instructorCInfo = rs1.getString("instructorCInfo");
		price = rs1.getInt("price");
		instructorExp = rs1.getString("instructorExp");
		Instructor Instructor1 = new Instructor( instructorID,  timeID,  instructorName,
				 instructorAddress,  instructorCInfo,  price,
				 instructorExp);
		Instructor1.setInstructorID(rs1.getInt(instructorID));
		Instructor1.setInstructorName(rs1.getString(instructorName));
		Instructor1.setTimeID(rs1.getInt("timeID"));
	
		
		Instructor1.setInstructorAddress(rs1.getString("instructorAddress"));
		Instructor1.setInstructorCInfo(rs1.getString("instructorCInfo"));
		Instructor1.setInstructorExp(rs1.getString("instructorExp"));
		Instructor1.setPrice(price);
		return Instructor1;
	}

}
*/
package InstructorRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.npu.courseapp.domain.Instructor;

public class InstructorRowMapper implements RowMapper<Instructor> {

	@Override
	public Instructor mapRow(ResultSet rs1, int rowNum) throws SQLException {
		
		int instructorID;
		String instructorName;
		String instructorAddress;
		String instructorCInfo;
		int price = 0;
		//int timeID;
		String instructorExp;
		instructorName = rs1.getString("instructorName");
		instructorID = rs1.getInt("instructorID");
		instructorAddress = rs1.getString("instructorAddress");
		instructorCInfo = rs1.getString("instructorCInfo");
		price = rs1.getInt("price");
		instructorExp = rs1.getString("instructorExp");
		//timeID = rs1.getInt("timeID");
		Instructor Instructor1 = new Instructor();
		
		Instructor1.setInstructorName(instructorName);
		Instructor1.setInstructorName(rs1.getString("instructorName"));
		Instructor1.setInstructorID(rs1.getInt("instructorID"));
		Instructor1.setInstructorAddress(rs1.getString("instructorAddress"));
		Instructor1.setInstructorCInfo(rs1.getString("instructorCInfo"));
		Instructor1.setInstructorExp(rs1.getString("instructorExp"));
		Instructor1.setPrice(price);
	//Instructor1.setTimeID(rs1.getInt("timeID"));
		return Instructor1;
	}

}
