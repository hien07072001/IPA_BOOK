package com.codegym.book.service.book;


import com.codegym.book.model.Book;

public interface BookService {
    Iterable<Book> getList();

    Book save(Book book);

    void delete(Long id);

    Book findById(Long id);
}
