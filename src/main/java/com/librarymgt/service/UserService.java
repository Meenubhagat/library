package com.librarymgt.service;

import java.util.List;

import com.librarymgt.model.User;

public interface UserService {
	
  public User create(User user);
  
  public List<User>getAllUser();
  
  public User getUserById(int id);
  
  public boolean deleteUserById(int userId);
  
  public User loadUserByUsername(String username);

  public User insertUser(String username, String password);
}
