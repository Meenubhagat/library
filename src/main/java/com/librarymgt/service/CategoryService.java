package com.librarymgt.service;

import java.util.List;

import com.librarymgt.model.Category;
import com.librarymgt.model.categorywithparent;

public interface CategoryService {
	
	public Category create(Category category);
	
	public List<Category>getAllCategory();
	
	public Category getCategoryById(int id);
	
	public List<Category> getParentCategories();
	
	public void deleteCategoryById(int categoryId);

	public List<categorywithparent> getCategoryWithParent();

	
}
