package com.example.librarymgrsystems.service;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.librarymgrsystems.entity.LibraryBooks;
import com.example.librarymgrsystems.repository.LibraryRepository;

@Service
public class LibraryService {
	
	@Autowired
	private LibraryRepository libraryRepository;
	
    public LibraryBooks addBooks(LibraryBooks librarybooks) {
        return libraryRepository.save(librarybooks);
    }

    public List<LibraryBooks> getAllBooks() {
    	Iterable<LibraryBooks> books = libraryRepository.findAll();
    	return StreamSupport.stream(books.spliterator(), false).collect(Collectors.toList());
    	}
    
    public LibraryBooks searchBookByISBN(long ISBN) {
    	return libraryRepository.findById(ISBN).get();
    }
  
    public LibraryBooks updateBook(Long id, LibraryBooks librarybooks) {
        librarybooks.setISBN(id);
        return libraryRepository.save(librarybooks);
    }

    public void deleteBook(Long ISBN) {
        libraryRepository.deleteById(ISBN);
    }
    public LibraryBooks updateBook(LibraryBooks librarybooks) {
    	
    	Long ISBN = librarybooks.getISBN();
    	LibraryBooks libbook = libraryRepository.findById(ISBN).get();
    	libbook.setTitle(librarybooks.getTitle());
    	libbook.setAuthor(librarybooks.getAuthor());
    	libbook.setGenre(librarybooks.getGenre());
    	libbook.setPublicationYear(librarybooks.getPublicationYear());
    	
    	return libraryRepository.save(libbook);
		}
	}
