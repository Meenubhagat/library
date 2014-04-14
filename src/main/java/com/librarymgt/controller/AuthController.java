package com.librarymgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/register")

public class AuthController {
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newRegisterPage(){
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

}
