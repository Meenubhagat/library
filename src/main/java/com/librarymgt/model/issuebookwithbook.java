package com.librarymgt.model;

public class issuebookwithbook {

	private Integer id;
	
	public String name;
	
	public Integer issueid;
	
	public String issuebook;
	
	public String username;
	
	public String category;
	

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIssueid() {
		return issueid;
	}

	public void setIssueid(Integer issueid) {
		this.issueid = issueid;
	}

	public String getIssuebook() {
		return issuebook;
	}

	public void setIssuebook(String issuebook) {
		this.issuebook = issuebook;
	}
	
	
}
