package com.example.WebAppProcess20.Repositories;

/*
 * Created by Amit Nissan on 12/5/2018
 */

import com.example.WebAppProcess20.Library.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
