package com.librarymgt.service;

import java.util.List;

import com.librarymgt.model.Category;

public interface CategoryWithService {
	
	public List<Category> getCommentsByDiscussionId();

}
