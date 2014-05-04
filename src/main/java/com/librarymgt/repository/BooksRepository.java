
package com.librarymgt.repository;

import org.springframework.data.repository.CrudRepository;

import com.librarymgt.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>{

}
