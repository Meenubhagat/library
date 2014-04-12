package com.librarymgt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.librarymgt.enums.Role;
import com.librarymgt.model.User;
import com.librarymgt.service.UserService;


@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newUserPage(){
		ModelAndView mav = new ModelAndView("user"); 
		return mav;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User user){
		/*
		System.out.println(request.getParameter("user_type"));
		System.out.println(request.getParameter("user_name"));
		System.out.println(request.getParameter("user_course"));
		System.out.println(request.getParameter("user_rollno"));
		System.out.println(request.getParameter("user_email"));
		System.out.println(request.getParameter("user_gender"));
		User user = new User();
		user.setType(request.getParameter("user_type"));
		user.setUsername(request.getParameter("user_name"));
		user.setCourse(request.getParameter("user_course"));
		user.setRollno(request.getParameter("user_rollno"));
		user.setEmail(request.getParameter("user_email"));
		user.setGender(request.getParameter("user_gender"));*/
		user.setRole(Role.User);
		
		userService.create(user);
		return new ModelAndView(new RedirectView("userlist"));
		
	}
	
	@RequestMapping(value="/userlist", method=RequestMethod.GET)
	public ModelAndView viewUser(){
		ModelAndView mav=new ModelAndView("user-tableview");
		mav.addObject("title1","our user");
		List<User> userlist = userService.getAllUser();
		mav.addObject("user",userlist);
		return mav;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editUser(@PathVariable int id) {
		final User use = userService.getUserById(id);
		ModelAndView mav = new ModelAndView("user");
		mav.addObject("user", use);
		return mav;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable int id){
		System.out.println("id:" + id);
		userService.deleteUserById(id);
		return new ModelAndView(new RedirectView("/librarymgt/user/userlist"));
		
	}

}
