package com.librarymgt.service;

import java.util.List;

import com.librarymgt.model.Books;
import com.librarymgt.model.Issuebook;

public interface BooksService {
	
	public Books create(Books books);
	
	public List<Books>getAllBooks();
	
	public Books getBookById(int id);
	
	public boolean deleteBookById(int bookId);
	
	public Issuebook issue(Issuebook book);

}
