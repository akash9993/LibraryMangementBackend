package com.nagarro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.model.Librarian;
import com.nagarro.service.LibrarianService;

@RestController
public class LibrarianController {
	@Autowired
	LibrarianService librarianService;

	@GetMapping("/user/{username}/{password}")
	public Librarian getLibrarian(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		return librarianService.findByUsernameAndPassword(username, password);

	}
}
