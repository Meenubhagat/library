package com.librarymgt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.librarymgt.enums.Role;
import com.librarymgt.model.User;
import com.librarymgt.service.UserService;

@Controller
@RequestMapping(value="/register")


public class AuthController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newRegisterPage(){
		ModelAndView mav = new ModelAndView("registration");
		return mav;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveRegistration(){
		System.out.println(request.getParameter("user_firstname"));
		System.out.println(request.getParameter("password"));
		System.out.println(request.getParameter("email"));
		
		User user1 = new User();
		
		
		user1.setFirstname(request.getParameter("firstname"));
		user1.setEmail(request.getParameter("email"));
		user1.setPassword(request.getParameter("password"));
		user1.setEnabled(true);
		user1.setRole(Role.ROLE_USER);
		user1.setGender("male");
		
		userService.create(user1);
		return new ModelAndView(new RedirectView("thankyou"));
		
	}
	
	@RequestMapping(value="/thankyou", method=RequestMethod.GET)
	public ModelAndView thankyousave(){
		ModelAndView mav = new ModelAndView("thanku-registration");
		
		return mav;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

	
}
