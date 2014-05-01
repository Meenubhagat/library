package com.librarymgt.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

	@Override
	public List<Category> getCategoryWithParent() {
		
		final String query = "SELECT category.*, parent.name FROM tbl_cat category, tbl_cat parent WHERE category.parent_id = parent.cat_id";
		final Query q = (Query) em.createNativeQuery(query, Object.class);
		List<Object> result = (List<Object>) q.getResultList();
		 
		return result;
	}

	@Override
	public List<Category> convertResultToList(final List<Object> result) {
		final List<DiscussionComments> results = new ArrayList<DiscussionComments>();
		for (int i = 0; i < result.size(); i++) {
			final DiscussionComments dc = new DiscussionComments();
			SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy hh:mm");

			Object[] r = (Object[]) result.get(i);
			dc.setCommentId((Integer)r[0]);
			dc.setComment((String)r[1]);
			dc.setCommentDate(format.format((Date)r[2]));
			dc.setUserId((Integer)r[3]);
			dc.setFirstName((String)r[4]);
			dc.setLastName((String)r[5]);
			dc.setPhoto((String)r[6]);
			results.add(dc);

			System.out.println(r[0]);
		}
		return results;
	}

	
	
}
