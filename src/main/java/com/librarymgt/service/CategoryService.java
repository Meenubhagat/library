package com.librarymgt.service;

import java.util.List;

import com.librarymgt.model.Category;

public interface CategoryService {
	
	public Category create(Category category);
	
	public List<Category>getAllCategory();
	
	public Category getCategoryById(int id);
	
	public Category getParentById(int id);
	
	public boolean deleteCategoryById(int categoryId);

}
