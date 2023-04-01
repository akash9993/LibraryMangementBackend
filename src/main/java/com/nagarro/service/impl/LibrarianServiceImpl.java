package com.nagarro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.model.Librarian;
import com.nagarro.repository.LibrarianRepository;
import com.nagarro.service.LibrarianService;

@Component
public class LibrarianServiceImpl implements LibrarianService {
	@Autowired
	LibrarianRepository librarianRepository;

	@Override
	public Librarian findByUsernameAndPassword(String username, String password) {
		Librarian librarian = librarianRepository.findByUsernameAndPassword(username, password);
		return librarian;
	}

}
