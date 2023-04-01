package com.nagarro.service;

import org.springframework.stereotype.Service;

import com.nagarro.model.Librarian;

@Service
public interface LibrarianService {
	public Librarian findByUsernameAndPassword(String username, String password);
}
