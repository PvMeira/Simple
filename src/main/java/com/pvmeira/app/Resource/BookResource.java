package com.pvmeira.app.Resource;

import com.pvmeira.app.Model.Book;
import com.pvmeira.app.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pvcir on 08/03/2017.
 */
@RestController
@RequestMapping(path = "/books")
public class BookResource {

    private final BookService bookService;


    @Autowired
    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public final ResponseEntity<Book> save(@RequestBody Book book) {
        this.bookService.save(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public final ResponseEntity<Book> update(@RequestBody Book book) {
        this.bookService.save(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public final ResponseEntity<Book> delete(@PathVariable("id") Long id) {
        this.bookService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public final Book findById(@PathVariable Long id) {
        return this.bookService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public final Iterable<Book> findAll() {
        return this.bookService.listAll();
    }
}
