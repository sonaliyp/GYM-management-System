package edu.npu.courseapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.npu.courseapp.dao.UserDao;
import edu.npu.courseapp.domain.User;
@Service
public class UserServicesImpl implements UserService{
@Autowired
@Qualifier("UserDaoJdbcImpl")
UserDao userdao;
	@Override
	public void insertNewuser(User user) {
	userdao.addNewUser(user);
		
	}
	@Override
	public void valid_login(String emailAddress, String password) {
		User user  = userdao.is_valid_admin_login(emailAddress, password);
		
	}
	public boolean valid_login1(String emailAddress, String password) {
		List<User> eq =  userdao.is_valid_admin_login1(emailAddress, password);
		if(eq.size() == 1){
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public boolean valid_login_user(String emailAddress, String password) {
		List<User> eq =  userdao.is_valid_admin_login_user(emailAddress, password);
		if(eq.size() == 1){
			return true;
		}
		else
		{
			return false;
		}
	}

}
