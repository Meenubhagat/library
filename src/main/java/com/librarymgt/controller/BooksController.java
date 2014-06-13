package com.librarymgt.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
import com.librarymgt.model.Issuebook;
import com.librarymgt.model.Issuedbokswithdetail;
import com.librarymgt.model.User;
import com.librarymgt.model.categorywithparent;
import com.librarymgt.model.issuebookwithbook;
import com.librarymgt.service.BooksService;
import com.librarymgt.service.CategoryService;
import com.librarymgt.service.UserService;

@Controller
@RequestMapping(value="/book")

public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	UserService userService;
	
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
	
	@RequestMapping(value="/issue", method=RequestMethod.GET)
	public ModelAndView issueBook(){
		List<Books> books = booksService.getAllBooks();
		ModelAndView mav = new ModelAndView("bookissue");
		mav.addObject("issue-book", "new book");
		mav.addObject("books", books);
		List<User> users = userService.getAllUser();
		mav.addObject("users" , users);
		return mav;
	}
	
	@RequestMapping(value="/booksaved", method=RequestMethod.POST)
	public ModelAndView saveissuebook(@ModelAttribute Issuebook book){
		System.out.println(request.getParameter("userid"));
		System.out.println(request.getParameter("bookid"));
		book.setIssueDate(new Date().toString());
		booksService.issue(book);
		return new ModelAndView(new RedirectView("issuedbooklist"));
	}
	
	
	@RequestMapping(value="/issuedbooklist", method=RequestMethod.GET)
	public ModelAndView viewissuedBook(){
		ModelAndView mav = new ModelAndView("issuedbook-list");
		mav.addObject("title2","issuedbooks");
		//List<Returnbookwithdetail> issuedbooklist = booksService.getReturnbookwithdetail();
		List<issuebookwithbook> issuedbooklist1 = booksService.getIssuebookWithBook();
		//System.out.println("count: " + issuedbooklist1.size());
		mav.addObject("issuedbooks",issuedbooklist1);
		//mav.addObject("issuedbooks", issuedbooklist1);
		return mav;
	}
	
	@RequestMapping(value="/editissuebook/{id}", method=RequestMethod.GET)
	public ModelAndView editissuebook(@PathVariable int Id){
		final Issuebook bookissue = booksService.getIssuedbookById(Id);
		ModelAndView mav = new ModelAndView("bookissue");
		mav.addObject("bookissue", bookissue);
		return mav;
	}
	
	@RequestMapping(value="/deleteissuebook/{id}", method=RequestMethod.GET)
	public ModelAndView deleteissuebook(@PathVariable int Id){
		System.out.println("id:" + Id);
		return new ModelAndView(new RedirectView("/librarymgt/book/issuedbooklist"));
	}
	
	@RequestMapping(value="/issuedbookdetail/{id}", method=RequestMethod.GET)
	public ModelAndView viewdetail(@PathVariable int id){
		ModelAndView mav = new ModelAndView("issuedbookdetail");
		mav.addObject("return", "issuedbookdetail");
		Issuedbokswithdetail issuedbookdetail = booksService.getIssuedbokwithdetail(id);
		mav.addObject("issuedbookdetail", issuedbookdetail);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		String issueDate =  issuedbookdetail.getIssuedate();
		Date date = null;
		try {
			date = formatter.parse(issueDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
 
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		long milis1 = cal.getTimeInMillis();
		System.out.println("The current date is : " + cal.getTime());
		cal.add(Calendar.DATE, 14);
		System.out.println("14 days later: " + cal.getTime());
		
		issuedbookdetail.setReturndate(cal.getTime().toString());
		
		
        long milis2 = cal.getTimeInMillis();
        
        // Calculate difference in milliseconds
        long diff = milis2 - milis1;
        
        // Calculate difference in days
        long diffDays = diff / (24 * 60 * 60 * 1000);
        
        System.out.println("In milliseconds: " + diff + " milliseconds.");
        System.out.println("In days: " + diffDays + " days.");
		   
		return mav;
	}
	
}
