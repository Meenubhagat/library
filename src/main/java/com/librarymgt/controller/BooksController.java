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

import com.librarymgt.model.Books;
import com.librarymgt.model.categorywithparent;
import com.librarymgt.service.BooksService;
import com.librarymgt.service.CategoryService;

@Controller
@RequestMapping(value="/book")

public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newBookPage(){
	ModelAndView mav = new ModelAndView("book");
	mav.addObject("title1", "Our Books");
	List<categorywithparent> catlist = categoryService.getCategoryWithParent();
	mav.addObject("category", catlist);
		return mav;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveBook(@ModelAttribute Books book){
		booksService.create(book);
		return new ModelAndView(new RedirectView("booklist"));
	}
	
	@RequestMapping(value="/booklist", method=RequestMethod.GET)
	public ModelAndView viewBooks(){
		ModelAndView mav=new ModelAndView("book-list");
		mav.addObject("title1","library books");
		List<Books> booklist = booksService.getAllBooks();
		mav.addObject("book",booklist);
		return mav;
	}

	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editBook(@PathVariable int id){
		final Books book = booksService.getBookById(id);
		ModelAndView mav = new ModelAndView("book");
		mav.addObject("book", book);
		return mav;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteBook(@PathVariable int id){
		System.out.println("id:" + id);
		booksService.deleteBookById(id);
		return new ModelAndView(new RedirectView("/librarymgt/book/booklist"));
		
	}
	
}
