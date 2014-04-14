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

import com.librarymgt.model.Category;
import com.librarymgt.service.CategoryService;

@Controller
@RequestMapping(value="/cat")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView newCategoryPage(){
		ModelAndView mav = new ModelAndView("tbl_category");
		return mav;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveCategory(@ModelAttribute Category category){
		categoryService.create(category);
		return new ModelAndView(new RedirectView("catlist"));
		
	}
	
	@RequestMapping(value="/catlist", method=RequestMethod.GET)
	public ModelAndView viewCategory(){
		ModelAndView mav = new ModelAndView("cat-view");
		mav.addObject("title1", "Our Category");
		List<Category> catlist = categoryService.getAllCategory();
		mav.addObject("category", catlist);
		return mav;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editCategory(@PathVariable int id){
		final Category cat1 = categoryService.getCategoryById(id);
		ModelAndView mav = new ModelAndView("cat");
		mav.addObject("Category", cat1);
		return mav;
	}

}
