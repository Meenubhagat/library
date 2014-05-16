package com.librarymgt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymgt.model.Books;
import com.librarymgt.model.Issuebook;
import com.librarymgt.model.issuebookwithbook;
import com.librarymgt.repository.BooksRepository;
import com.librarymgt.repository.IssueBookRepository;
import com.librarymgt.service.BooksService;

@Service
public class BooksServiceImp implements BooksService {
	
	@Autowired
	BooksRepository booksRepository;
	
	@Autowired
	IssueBookRepository issuebookRepository;
	

	@PersistenceContext
    EntityManager em;

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

	@Override
	public Issuebook issue(Issuebook book) {
		Issuebook issuedBook = book;
		return issuebookRepository.save(issuedBook);
	}

	@Override
	public List<Issuebook> getAllIssuedBooks() {
		
		return (List<Issuebook>) issuebookRepository.findAll();
	}

	@Override
	public Issuebook getIssuedbookById(int Id) {
		
		return issuebookRepository.findOne(Id);
	}

	@Override
	public boolean deleteissuedbookById(int Id) {
		booksRepository.delete(Id);
		return true;
	}

	@Override
	public List<issuebookwithbook> getIssuebookWithBook() {
		final String query = "SELECT issuebook.*, book.name  FROM  tbl_issue_book issuebook,  tbl_book book  WHERE issuebook.book_id = book.book_id";
		final Query q = (Query) em.createNativeQuery(query);
		List<Object> result = q.getResultList();
		
		return convertResultToList(result);
	}
	
	@Override
	public List<Issuebook> getIssueBook() {
		final String query = "SELECT * FROM tbl_issue_book WHERE issue_id=0";
		final Query q = (Query) em.createNativeQuery(query,Issuebook.class);
		List<Issuebook> result = (List<Issuebook>) q.getResultList();
		
		return result;
	}

	private List<issuebookwithbook> convertResultToList(final List<Object> result) {
		final List<issuebookwithbook> results = new ArrayList<issuebookwithbook>();
		for(int i=0;i<results.size();i++){
		final issuebookwithbook dc = new issuebookwithbook();
		
			Object[] r = (Object[]) result.get(i);
		    dc.setId((Integer) r[0]);
		    dc.setIssuebook((String) r[1]);
		    dc.setIssueid((Integer) r[2]);
		    dc.setName((String)r[3]);
		    
		    result.add(dc);
	}
	return results;


}
	
}
