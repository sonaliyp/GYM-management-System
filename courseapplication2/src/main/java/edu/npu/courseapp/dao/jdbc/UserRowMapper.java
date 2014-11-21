package edu.npu.courseapp.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.npu.courseapp.domain.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		String emailAddress;
		String password;
		String firstName;
		String lastName;
		String city;
		String state;
		String country;
		int isAdmin;
		int userID;
		userID = rs.getInt("userID");
		emailAddress = rs.getString("emailAddress");
		password = rs.getString("password");
		firstName = rs.getString("firstName");
		lastName = rs.getString("lastName");
		city = rs.getString("city");
		state = rs.getString("state");
		country = rs.getString("country");
		isAdmin = rs.getInt("isAdmin");
		User users = new User(emailAddress, userID, password, firstName,
				lastName, city, state, country, isAdmin);

		users.setCity(rs.getString("city"));
		users.setCountry(country);
		users.setEmailAddress(rs.getString("emailAddress"));
		users.setFirstName(firstName);
		users.setIsAdmin(rs.getInt("isAdmin"));
		users.setLastName(lastName);
		users.setPassword(rs.getString("password"));
		users.setState(rs.getString("state"));
		users.setUserID(rs.getInt("userID"));

		return users;
	}

}
