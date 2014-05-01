package com.librarymgt.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymgt.model.Category;
import com.librarymgt.model.categorywithparent;
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

	@Override
	public List<categorywithparent> getCategoryWithParent() {
		
		final String query = "SELECT category.*, parent.name AS parentname FROM tbl_cat category, tbl_cat parent WHERE category.parent_id = parent.cat_id";
		final Query q = (Query) em.createNativeQuery(query);
		List<Object> result = q.getResultList();
		 
		return convertResultToList(result);
	}

	private List<categorywithparent> convertResultToList(final List<Object> result) {
		final List<categorywithparent> results = new ArrayList<categorywithparent>();
		for (int i = 0; i < result.size(); i++) {
			final categorywithparent dc = new categorywithparent();

			Object[] r = (Object[]) result.get(i);
			dc.setId((Integer)r[0]);
			dc.setName((String)r[1]);
			dc.setParentid((Integer)r[2]);
			dc.setParentcategory((String)r[3]);
			
			results.add(dc);
		}
		return results;
	}

	
	
}
