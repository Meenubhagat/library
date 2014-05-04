package com.librarymgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.librarymgt.model.Books;
import com.librarymgt.service.BooksService;

@Controller
@RequestMapping(value="/book")

public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newBookPage(){
	ModelAndView mav = new ModelAndView("book");
	mav.addObject("title1", "Our Books");
		return mav;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveBook(@ModelAttribute Books book){
		booksService.create(book);
		return new ModelAndView(new RedirectView("bookslist"));
	}
	
	@RequestMapping(value="/booklist", method=RequestMethod.GET)
	public ModelAndView viewUser(){
		ModelAndView mav=new ModelAndView("book-list");
		mav.addObject("title1","library books");
		List<Books> booklist = booksService.getAllBooks();
		mav.addObject("user",booklist);
		return mav;
	}

}
