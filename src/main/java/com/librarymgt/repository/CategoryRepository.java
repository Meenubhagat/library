package com.librarymgt.repository;

import org.springframework.data.repository.CrudRepository;

import com.librarymgt.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    
    
}