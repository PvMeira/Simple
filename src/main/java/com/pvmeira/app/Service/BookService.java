package com.pvmeira.app.Service;

import com.pvmeira.app.Model.Book;

import java.util.List;

/**
 * Created by pvcir on 08/03/2017.
 */
public interface BookService {

    void save(Book book);
    void delete(Long id);
    void update(Book book);
    List<Book> listAll();
    Book findById(Long id);
    List<Book> findByName(String name);
}
