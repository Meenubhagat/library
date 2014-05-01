package com.librarymgt.model;

import javax.persistence.Column;

public class categorywithparent {
	
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="parent_id")
	public Integer parentid;
	
	@Column(name="parent_category")
	public String parentcategory;

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

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getParentcategory() {
		return parentcategory;
	}

	public void setParentcategory(String parentcategory) {
		this.parentcategory = parentcategory;
	}
	

}
