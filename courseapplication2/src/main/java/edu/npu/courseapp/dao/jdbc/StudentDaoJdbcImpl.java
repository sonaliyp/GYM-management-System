package edu.npu.courseapp.dao.jdbc;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import edu.npu.courseapp.dao.StudentDao;
import edu.npu.courseapp.domain.Student;

@Repository("StudentDaoJdbcImpl")
public class StudentDaoJdbcImpl implements StudentDao {
	@Autowired
	private DataSource dataSource;
	private SimpleJdbcInsert jdbcInsert;

	@PostConstruct
	public void setup() {
		jdbcInsert = new SimpleJdbcInsert(dataSource);
		jdbcInsert.withTableName("student");
		jdbcInsert.usingGeneratedKeyColumns("id");
	}

	public void insertStudent(Student stud) {
		long id;
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(
				stud);
		Number newId = jdbcInsert.executeAndReturnKey(paramSource);
		id = newId.longValue();
		stud.setId(id);
	}

}
