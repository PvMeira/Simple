package com.pvmeira.app.Service.Implementation;

import com.pvmeira.app.Model.Book;
import com.pvmeira.app.Repository.BookRepository;
import com.pvmeira.app.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pvcir on 08/03/2017.
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void save(Book book) {
        this.bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        this.bookRepository.delete(id);
    }

    @Override
    public void update(Book book) {
     this.bookRepository.save(book);
    }

    @Override
    public List<Book> listAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return this.bookRepository.findOne(id);
    }

    @Override
    public List<Book> findByName(String name) {
        return this.bookRepository.findByNameIgnoreCase(name);
    }
}
