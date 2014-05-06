package com.librarymgt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymgt.model.Books;
import com.librarymgt.repository.BooksRepository;
import com.librarymgt.service.BooksService;

@Service
public class BooksServiceImp implements BooksService {
	
	@Autowired
	BooksRepository booksRepository;

	@Override
	public Books create(Books books) {
		Books createdBook = books;
		return booksRepository.save(createdBook);
	}

	@Override
	public List<Books> getAllBooks() {
		return (List<Books>) booksRepository.findAll();
	}

	@Override
	public Books getBookById(int id) {
		
		return booksRepository.findOne(id);
	}

	@Override
	public boolean deleteBookById(int bookId) {
		booksRepository.delete(bookId);
		return true;
	}

	

	
}
