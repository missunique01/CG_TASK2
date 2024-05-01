package com.example.librarymgrsystems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymgrsystems.service.LibraryService;
import com.example.librarymgrsystems.entity.LibraryBooks;


@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class LibraryController {
	
	@Autowired
	private LibraryService libraryservice;
	
	@PostMapping("/addBooks")
	public LibraryBooks addBooks(@RequestBody LibraryBooks libraryBooks) {
		return libraryservice.addBooks(libraryBooks);		
	}
	
	@GetMapping("/getBook/{ISBN}")
	public LibraryBooks searchBook(@PathVariable Long ISBN){
		return libraryservice.searchBookByISBN(ISBN);
	}
	
	@DeleteMapping("/deleteBook/{ISBN}")
	public void deleteBook(@PathVariable Long ISBN) {
		libraryservice.deleteBook(ISBN);
	}
	@PutMapping("/updateBook")
	public LibraryBooks updateBook(@RequestBody LibraryBooks librarybooks) {
		return libraryservice.updateBook(librarybooks);
	}

}

