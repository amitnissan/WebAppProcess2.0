package com.example.WebAppProcess20.bootstrap;

/*
 * Created by Amit Nissan on 14/5/2018
 */

import com.example.WebAppProcess20.Library.Author;
import com.example.WebAppProcess20.Library.Book;
import com.example.WebAppProcess20.Library.Publisher;
import com.example.WebAppProcess20.Repositories.AuthorRepository;
import com.example.WebAppProcess20.Repositories.BookRepository;
import com.example.WebAppProcess20.Repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Author cj = new Author("CJ", "Williams");
        Publisher john = new Publisher("John Thompson", "123St");
        Book gName = new Book("The History of Generic Names", "1234", john);
        cj.getBooks().add(gName);
        gName.getAuthors().add(cj);

        publisherRepository.save(john);
        authorRepository.save(cj);
        bookRepository.save(gName);

        Author deandre = new Author("DeAndre", "Jordan");
        Publisher dwight = new Publisher("Dwight Howard", "234St");
        Book fThrows = new Book("How to Shoot Free Throws", "2345", dwight);
        deandre.getBooks().add(fThrows);
        fThrows.getAuthors().add(deandre);

        publisherRepository.save(dwight);
        authorRepository.save(deandre);
        bookRepository.save(fThrows);
    }

}
