package com.librarymgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymgt.model.Category;
import com.librarymgt.repository.CategoryRepository;
import com.librarymgt.service.CategoryService;

@Service
public class CategoryServiceImp implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category create(Category category) {
		Category createdCategory = category;
		return categoryRepository.save(createdCategory);
	}

	@Override
	public List<Category> getAllCategory() {
		
		return (List<Category>) categoryRepository.findAll();
	}

}