package com.example.librarymgrsystems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LibBooks")
public class LibraryBooks {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long ISBN;
    private String Title;
    private String Author;
    private String Genre;
    private int publication_year;

    // Getters and Setters
    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public int getPublicationYear() {
        return publication_year;
    }

    public void setPublicationYear(int publication_year) {
        this.publication_year = publication_year;
    }
}
