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
@Table(name="tbl_cat")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_cat_id")
	@SequenceGenerator(name="seq_cat_id", sequenceName="seq_cat_id")
	
	@Column(name="cat_id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="parent_id")
	private Integer pid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	
	
}