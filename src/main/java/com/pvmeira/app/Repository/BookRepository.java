package com.pvmeira.app.Repository;

import com.pvmeira.app.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by pvcir on 08/03/2017.
 */
public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findByNameIgnoreCase(String s);
}
