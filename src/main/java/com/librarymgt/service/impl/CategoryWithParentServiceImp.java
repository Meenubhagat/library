package com.librarymgt.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.librarymgt.model.Category;
import com.librarymgt.service.CategoryWithService;

@Service
public class CategoryWithParentServiceImp implements CategoryWithService {
	

	@PersistenceContext
    EntityManager em;

	@Override
	public List<Category> getCommentsByDiscussionId() {
		final String query = "SELECT category.*, parent.name FROM tbl_cat category, tbl_cat parent WHERE category.parent_id = parent.cat_id";
		final Query q = (Query) em.createNativeQuery(query, Category.class);
		List<Category> result = (List<Category>) q.getResultList();
		 
		return result;
	}
	
}