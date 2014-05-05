package com.librarymgt.service;

import java.util.List;

import com.librarymgt.model.Books;

public interface BooksService {
	
	public Books create(Books books);
	
	public List<Books>getAllBooks();
	
	public Books getBookById(int id);

}
