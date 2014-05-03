package com.librarymgt.service.impl;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;

import com.librarymgt.repository.BookRepository;
import com.librarymgt.service.BookService;

public class BookServiceImp implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book create(Book book) {
		Book createdBook = book;
		return bookRepository.save(createdBook);
	}

}
