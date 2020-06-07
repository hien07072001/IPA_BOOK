package com.codegym.book.controller;

import com.codegym.book.model.Book;
import com.codegym.book.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/api/books")
    public ResponseEntity<List<Book>>  getList(){
        List<Book> bookList =(List<Book>) bookService.getList();
        return new ResponseEntity<>(bookList, HttpStatus.OK);

    }
    @PostMapping("/api/books")
    public ResponseEntity<Void>addBook(@RequestBody Book book){
        bookService.save(book);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
