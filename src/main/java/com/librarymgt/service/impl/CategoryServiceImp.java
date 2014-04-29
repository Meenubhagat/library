package com.librarymgt.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymgt.model.Category;
import com.librarymgt.repository.CategoryRepository;
import com.librarymgt.service.CategoryService;

@Service
public class CategoryServiceImp implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@PersistenceContext
    EntityManager em;
	
	@Override
	public Category create(Category category) {
		Category createdCategory = category;
		return categoryRepository.save(createdCategory);
	}

	@Override
	public List<Category> getAllCategory() {
		
		return (List<Category>) categoryRepository.findAll();
	}



	@Override
	public List<Category> getParentCategories(){
		final String query = "SELECT * FROM tbl_cat  WHERE parent_id = 0";
		final Query q = (Query) em.createNativeQuery(query, Category.class);
		List<Category> result = (List<Category>) q.getResultList();
		 
		return result;
	}

	@Override
	public Category getCategoryById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return false;
	}

}
