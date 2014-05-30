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
import com.librarymgt.model.categorywithparent;
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
		List<Category> parentCategories = categoryService.getParentCategories();
		mav.addObject("category",parentCategories);
		return mav;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveCategory(@ModelAttribute Category category){
		System.out.println("id:" + category.getId());
		categoryService.create(category);
		return new ModelAndView(new RedirectView("catlist"));
		
	}
	
	@RequestMapping(value="/catlist", method=RequestMethod.GET)
	public ModelAndView viewCategory(){
		ModelAndView mav = new ModelAndView("cat-view");
		List<categorywithparent> catlist = categoryService.getCategoryWithParent();
		mav.addObject("category", catlist);
		return mav;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editCategory(@PathVariable int id){
		final Category cat1 = categoryService.getCategoryById(id);
		ModelAndView mav = new ModelAndView("tbl_category");
		mav.addObject("cat", cat1);
		List<Category> parentCategorie = categoryService.getParentCategories();
		mav.addObject("category",parentCategorie);
		return mav;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteCategory(@PathVariable int id){
		System.out.println("id:" + id);
		categoryService.deleteCategoryById(id);
		return new ModelAndView(new RedirectView("/librarymgt/cat/catlist"));
	}

}
