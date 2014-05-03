package com.librarymgt.repository;

import java.awt.print.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
