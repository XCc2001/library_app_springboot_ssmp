package com.myspringboot.controller;

import com.myspringboot.controller.utils.Result;
import com.myspringboot.domain.Book;
import com.myspringboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public Result getAll() {
        return new Result(true, bookService.getAll());
    }

    @PostMapping
    public Result save(@RequestBody Book book)throws IOException {
        if (book.getName().equals("123")) throw new IOException();
        boolean flag =  bookService.save(book);
        return new Result(flag, flag ? "添加成功^_^!" : "添加失败-_-!");
    }

    @PutMapping
    public Result update(@RequestBody Book book) {

        return new Result (bookService.update(book));
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id) {

        return new Result(bookService.delete(id));
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id) {

        return new Result(true, bookService.getById(id));
    }

    // Paging query
    @GetMapping("/{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage, @PathVariable int pageSize) {

        return new Result(true, bookService.getPage(currentPage, pageSize));
    }
}
