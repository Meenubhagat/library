package com.librarymgt.service;

import java.util.List;

import com.librarymgt.model.Category;

public interface CategoryService {
	
	public Category create(Category category);
	
	public List<Category>getAllCategory();
	
	public Category getCategoryById();
	
	public List<Category> getParentCategories();
	
	public boolean deleteCategoryById(int categoryId);

	public List<Category> getCategoryWithParent();
	
	public List<Category> convertResultToList();
}
