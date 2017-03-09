package com.pvmeira.app.Model;


import javax.persistence.Id;

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import java.io.Serializable;


 /**
 * Created by pvmeira on 22/02/2017.
 */
@Entity(name = "book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 300)
    private String name;

    @Column(name = "author", length = 300)
    private String author;

    @Column(name = "observation", length = 600)
    private String observation;

    @Column(name = "pages")
    private int pages;

    @Column(name = "year")
    private int year;

    private String picture;


    public Book() {
    }

    public Book(Long id, String name, String author, String observation, int pages, int year, String picture) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.observation = observation;
        this.pages = pages;
        this.year = year;
        this.picture = picture;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        if (year != book.year) return false;
        if (id != null ? !id.equals(book.id) : book.id != null) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        if (observation != null ? !observation.equals(book.observation) : book.observation != null) return false;
        return picture != null ? picture.equals(book.picture) : book.picture == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (observation != null ? observation.hashCode() : 0);
        result = 31 * result + pages;
        result = 31 * result + year;
        result = 31 * result + (picture != null ? picture.hashCode() : 0);
        return result;
    }
}