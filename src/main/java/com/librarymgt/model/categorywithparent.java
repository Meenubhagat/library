package com.librarymgt.model;


public class categorywithparent {
	
	
	private Integer id;
	
	
	public String name;
	
	
	public Integer parentid;
	
	
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
