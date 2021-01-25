package com.hkarabakla.services;

import com.hkarabakla.repositories.BookRepo;
import org.springframework.stereotype.Component;


@Component
public class BookService {

    private final BookRepo bookRepo;


    public BookService(BookRepo bookRepo) {

        this.bookRepo = bookRepo;


    }


    public void findBook(String bookName) {

        System.out.println(bookRepo.findByName(bookName));


    }


}
