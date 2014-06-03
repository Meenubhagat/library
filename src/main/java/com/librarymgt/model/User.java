package com.librarymgt.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com. librarymgt.enums.Role;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_user")
public class User {
        
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq_user_id")
	@SequenceGenerator(name="seq_user_id", sequenceName="seq_user_id")
	@Column(name="user_id")
    private Integer id;

	
	@Column(name="firstname", nullable=false)
	public String firstname;
	
	@Column(name="middlename", nullable=true)
	public String middlename;
	
	@Column(name="lastname", nullable=true)
	public String lastname;
	
	@Column(name="course", nullable=true)
	public String course;
	
	@Column(name="rollno", nullable=true)
	public Integer rollno;

	@Column(name="password", nullable=false)
    public String password;

	@Column(name="enabled", nullable=false)
    public Boolean enabled;
	
	@Column(name="type", nullable=true)
	public String type;
	
	@Column(name="photo", nullable=true)
	public String photo;
	
	@Column(name="email", nullable=false)
	public String email;
	
	@Column(name="gender", nullable=false)
	public String gender;
	
	@Enumerated(EnumType.STRING)
	@Column(name="role", nullable=false)
    public Role role;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}


	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
        
}