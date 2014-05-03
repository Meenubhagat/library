package com.librarymgt.model;

import java.util.Date;

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
@Table(name="tbl_book")
public class Books {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_book_id")
	@SequenceGenerator(name="seq_book_id", sequenceName="seq_book_id")
	
	@Column(name="book_id")
	public Integer bookid;
	
	@Column(name="name")
	public String name;
	
	@Column(name="code")
	public String code;
	
	@Column(name="author")
	public String author;
	
	@Column(name="date_of_arrival")
	public Date date;
	
	@Column(name="price")
	public Float price;
	
	@Column(name="rackno")
	public Integer rackno;
	
	@Column(name="category_id")
	public Integer c_id;

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getRackno() {
		return rackno;
	}

	public void setRackno(Integer rackno) {
		this.rackno = rackno;
	}

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	
	
	
	
	

}
