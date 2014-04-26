package com.librarymgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymgt.model.User;
import com.librarymgt.repository.UserRepository;
import com.librarymgt.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User loadUserByUsername(String username) {
		
		
		return null;
	}
	
	@Override
	public User insertUser(String username, String password) {
		
		User u = new User();
		/*u.setUsername(username);
		u.setPassword(password);
		u.setEnabled(true);
		u.setRole(Role.ROLE_USER);
		u = userRepository.save(u);*/
		return u;
	}

	@Override
	public User create(User user) {
		User createdUser = user;
		return userRepository.save(createdUser);
	}
	
	

	@Override
	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}

	@Override
	public boolean deleteUserById(int userId) {
		userRepository.delete(userId);
		return true;
	}

}
