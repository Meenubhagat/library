package com.librarymgt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_issue_book")
public class Issuebook {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_book_id")
	@SequenceGenerator(name="seq_book_id", sequenceName="seq_book_id")
	
	@Column(name="book_id")
	public Integer bookid;
	
	@Column(name="issue_id")
	private Integer id;
	
	@Column(name="user_id")
	public Integer userid;
	
	@Column(name="issue_date")
	public String issueDate;
	
	@Column(name="return_date")
	public String returnDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	

}
