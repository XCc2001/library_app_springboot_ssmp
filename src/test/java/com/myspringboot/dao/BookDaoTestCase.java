package com.myspringboot.dao;

import com.myspringboot.domain.Book;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.batch.MyBatisPagingItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book.getType(), book.getName(), book.getDescription());

    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(17);
        book.setType("测试数据abcdefg");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book.getId(), book.getType(), book.getName(), book.getDescription());
    }

    @Test
    void testDelete(){
        bookDao.deleteById(17);
    }

    @Test
    void testGetAll(){
        bookDao.selectList();
    }

        @Test
    void testGetPage(){
            bookDao.selectPage(2,2);
    }
//    @Test
//    void testGetBy(){
//        System.out.println(bookDao.selectList("name", "Spring"));;
//    }
}
