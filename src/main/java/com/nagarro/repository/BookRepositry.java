package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.model.Book;

@Repository
public interface BookRepositry extends JpaRepository<Book, Integer> {

}
