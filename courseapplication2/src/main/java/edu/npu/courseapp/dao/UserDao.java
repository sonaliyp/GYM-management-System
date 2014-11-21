package edu.npu.courseapp.dao;


import java.util.List;
import edu.npu.courseapp.domain.User;

public interface UserDao {
public void addNewUser(User user);
public User is_valid_admin_login(String emailAddress, String password);
public List<User>  is_valid_admin_login1(String emailAddress, String password);
public List<User>  is_valid_admin_login_user(String emailAddress, String password);


}
