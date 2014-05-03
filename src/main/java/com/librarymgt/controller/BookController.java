package com.librarymgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/book")

public class BookController {
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newBookPage(){
	ModelAndView mav = new ModelAndView("book");
	mav.addObject("title1", "Our Books");
		return mav;
	}

}
