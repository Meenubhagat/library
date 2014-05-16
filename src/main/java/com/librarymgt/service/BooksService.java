package com.librarymgt.service;

import java.util.List;

import com.librarymgt.model.Books;
import com.librarymgt.model.Category;
import com.librarymgt.model.Issuebook;
import com.librarymgt.model.issuebookwithbook;

public interface BooksService {
	
	public Books create(Books books);
	
	public List<Books>getAllBooks();
	
	public Books getBookById(int id);
	
	public boolean deleteBookById(int bookId);
	
	public Issuebook issue(Issuebook book);
	
	public List<Issuebook>getAllIssuedBooks();
	
	public Issuebook getIssuedbookById(int Id);
	
	public boolean deleteissuedbookById(int Id);
	
	public List<Issuebook> getIssueBook();
	
	public List<issuebookwithbook> getIssuebookWithBook();

}
