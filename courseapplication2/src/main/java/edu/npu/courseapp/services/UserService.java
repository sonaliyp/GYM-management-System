package edu.npu.courseapp.services;

import edu.npu.courseapp.domain.User;

public interface UserService {
public void insertNewuser(User user);
public void valid_login(String emailAddress, String password);
public boolean valid_login1(String emailAddress, String password);
public boolean valid_login_user(String emailAddress, String password);
}
