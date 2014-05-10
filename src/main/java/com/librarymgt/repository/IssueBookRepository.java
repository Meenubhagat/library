package com.librarymgt.repository;

import org.springframework.data.repository.CrudRepository;

import com.librarymgt.model.Issuebook;

public interface IssueBookRepository extends CrudRepository<Issuebook, Integer>{

}