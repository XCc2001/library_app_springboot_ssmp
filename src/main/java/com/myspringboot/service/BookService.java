package com.myspringboot.service;

import com.myspringboot.domain.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();

    List<Book> getPage(int currentPage, int pageSize);
}
