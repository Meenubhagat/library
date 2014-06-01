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
import com.librarymgt.model.Issuedbokswithdetail;
import com.librarymgt.model.Returnbookwithdetail;
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
		//final String query = "SELECT issuebook.*, book.name, CONCAT(users.firstname, ' ',users.lastname) AS username FROM tbl_issue_book issuebook, tbl_book book, tbl_user users WHERE issuebook.book_id = book.book_id AND issuebook.user_id = users.user_id";
		final String query = "SELECT issuebooks.issue_id,users.user_id ,books.name, users.firstname,category.name as catname  FROM tbl_book books, tbl_issue_book issuebooks, tbl_user users , tbl_cat category WHERE books.book_id = issuebooks.book_id AND users.user_id = issuebooks.user_id AND books.category_id = category.cat_id";
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
		for(int i=0;i<result.size();i++){
			final issuebookwithbook dc = new issuebookwithbook();
			Object[] r = (Object[]) result.get(i);			
		    
			dc.setIssueid((Integer) r[0]);
		    dc.setIssuebook((String) r[2]);
		    dc.setUsername((String) r[3]);
		    dc.setCategory((String) r[4]);
		    
		    results.add(dc);
	}
	return results;
	}

	@Override
	public List<Returnbookwithdetail> getReturnbookwithdetail() {
		
		final String query = "SELECT issuebooks.issue_id,users.user_id ,books.name, users.firstname,category.name as catname  FROM tbl_book books, tbl_issue_book issuebooks, tbl_user users , tbl_cat category WHERE books.book_id = issuebooks.book_id AND users.user_id = issuebooks.user_id AND books.category_id = category.cat_id";
		final Query q = (Query) em.createNativeQuery(query);
		List<Object> result = q.getResultList();
		
		return convertResultToReturnList(result);
	}
	
	private List<Returnbookwithdetail> convertResultToReturnList(final List<Object> result) {
		final List<Returnbookwithdetail> results = new ArrayList<Returnbookwithdetail>();
		for(int i=0;i<result.size();i++){
			final Returnbookwithdetail dc = new Returnbookwithdetail();
			Object[] r = (Object[]) result.get(i);			
		    dc.setIssuedid((Integer) r[0]);
		    dc.setUsername((String) r[1]);
		    dc.setBookname((String)r[2]);
		    dc.setIssuedby((String) r[3]);
		  
		    results.add(dc);
		}
	return results;
	}

	@Override
	public List<Issuedbokswithdetail> getIssuedbokwithdetail(int issuedId) {
		final String query = "SELECT books.name,books.author,books.code,books.price,books.rackno,users.email,users.course,users.firstname,users.gender,users.rollno,issuebooks.issue_id,issuebooks.issue_date FROM tbl_book books, tbl_issue_book issuebooks, tbl_user users  WHERE books.book_id = issuebooks.book_id AND users.user_id = issuebooks.user_id AND issuebooks.issue_id = " + issuedId;
		final Query q = (Query) em.createNativeQuery(query);
		List<Object> result = q.getResultList();
		
		return convertResultTodeatilList(result);
	}
	
	private List<Issuedbokswithdetail> convertResultTodeatilList(List<Object> result) {
		final List<Issuedbokswithdetail> results = new ArrayList<Issuedbokswithdetail>();
		for(int i=0; i<result.size(); i++){
			final Issuedbokswithdetail dc = new Issuedbokswithdetail();
			Object[] d = (Object[]) result.get(i);
			dc.setBookname((String) d[0]);
			dc.setBookauthor((String) d[1]);
			dc.setBookcode((String) d[2]);
			dc.setBookprice((Float) d[3]);
			dc.setRackno((Integer) d[5]);
			dc.setUseremail((String) d[6]);
			dc.setCourse((String) d[7]);
			dc.setName((String) d[8]);
			dc.setGender((String) d[9]);
			dc.setRollno((Integer) d[10]);
			dc.setIssueid((Integer) d[11]);
			dc.setIssuedate((String) d[12]);
			results.add(dc);
		}
		return results;
	}
	
}
