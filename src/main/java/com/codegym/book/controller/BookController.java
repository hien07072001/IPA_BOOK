package com.codegym.book.controller;

import com.codegym.book.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class BookController {
    @Autowired
    BookService bookService;

}
