package com.example.librarymgrsystems.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.librarymgrsystems.entity.LibraryBooks;


public interface LibraryRepository extends CrudRepository<LibraryBooks, Long> {

}
