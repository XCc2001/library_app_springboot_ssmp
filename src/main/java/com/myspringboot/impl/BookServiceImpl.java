package com.myspringboot.impl;

import com.myspringboot.dao.BookDao;
import com.myspringboot.domain.Book;
import com.myspringboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book.getType(), book.getName(), book.getDescription()) > 0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.updateById(book.getId(), book.getType(), book.getName(), book.getDescription()) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList();
    }

    @Override
    public List<Book> getPage(int currentPage, int pageSize) {
        return bookDao.selectPage(currentPage, pageSize);
    }
}
