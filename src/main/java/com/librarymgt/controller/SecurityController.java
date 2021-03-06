package com.librarymgt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com. librarymgt.service.UserService;

@Controller
@Slf4j
public class SecurityController {
	
	@Autowired(required=true)
	UserService userService;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView login() {
		
		return new ModelAndView("login");
	}

	@RequestMapping(value="/accessdenied", method=RequestMethod.GET)
	public ModelAndView accessdenied() {
		
		return new ModelAndView("common/accessdenied");
	}

   @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
	   SecurityContextHolder.clearContext();	   
	   return "redirect:/login";
    }
	   
	@RequestMapping(value = "/create", method = RequestMethod.GET)
    public String redirectRequestToRegistrationPage() {
	
		userService.insertUser("sumit", "123456");
		return "";
    }
	
}
