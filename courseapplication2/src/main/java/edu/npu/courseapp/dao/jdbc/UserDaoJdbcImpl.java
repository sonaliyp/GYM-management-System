package edu.npu.courseapp.dao.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import edu.npu.courseapp.dao.UserDao;
import edu.npu.courseapp.domain.User;

@Repository("UserDaoJdbcImpl")
public class UserDaoJdbcImpl implements UserDao {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate dbTemplate;
	private SimpleJdbcInsert jdbcInsert;
	private UserRowMapper userowMapper;
	private ArrayList<User> userlist;
	static int idCnt = 1;

	@PostConstruct
	public void setup() {
		jdbcTemplate = new JdbcTemplate(dataSource);
		dbTemplate = new NamedParameterJdbcTemplate(dataSource);
		userowMapper = new UserRowMapper();
		jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("users")
				.usingColumns("userID", "emailAddress", "password",
						"firstName", "lastName", "city", "state", "country",
						"isAdmin");
		userlist = new ArrayList<User>();

	}

	@Override
	public void addNewUser(User user) {

		int userID = user.getUserID();
		String emailAddress = user.getEmailAddress();
		String password = user.getPassword();
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		String city = user.getCity();
		String state = user.getState();
		String country = user.getCountry();
		int isAdmin = user.getIsAdmin();
		String sql = "Insert into users (userID, emailAddress,  password, firstName,  lastName,  city,  state,country,  isAdmin) values (?,?,?,?,?,?,?,?,?)";
		int row = jdbcTemplate.update(sql, userID, emailAddress, password,
				firstName, lastName, city, state, country, isAdmin);

	}

	@Override
	public User is_valid_admin_login(String emailAddress, String password) {
		// String sql =
		// "SELECT userID FROM users WHERE emailAddress = :emailAddress AND password = :password ";
		String sql = "SELECT * FROM users WHERE emailAddress =:emailAddress AND password =:password ";
		// MapSqlParameterSource params = new
		// MapSqlParameterSource("emailAddress", emailAddress);
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("password", password);
		params.addValue("emailAddress", emailAddress);
		User in = dbTemplate.queryForObject(sql, params, userowMapper);
		return in;
	}

	public List<User> is_valid_admin_login1(String emailAddress, String password) {
		String sql = "SELECT * FROM users WHERE emailAddress =:emailAddress AND password =:password AND isAdmin = 1 ";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("password", password);
		params.addValue("emailAddress", emailAddress);
		List<User> userlist = dbTemplate.query(sql, params, userowMapper);
		return userlist;
	}

	public List<User> is_valid_admin_login_user(String emailAddress, String password) {
		String sql = "SELECT * FROM users WHERE emailAddress =:emailAddress AND password =:password  ";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("password", password);
		params.addValue("emailAddress", emailAddress);
		List<User> userlist = dbTemplate.query(sql, params, userowMapper);
		return userlist;
	}
}
