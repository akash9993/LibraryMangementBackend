package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.model.Librarian;

public interface LibrarianRepository extends JpaRepository<Librarian, String> {
	public Librarian findByUsernameAndPassword(String username, String password);
}
