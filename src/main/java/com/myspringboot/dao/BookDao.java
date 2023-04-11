package com.myspringboot.dao;

import com.myspringboot.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    public Book selectById(Integer id);

    @Insert("insert into tbl_book (type, name, description) values(#{type}, #{name}, #{description})")
    public int insert(String type, String name, String description);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int updateById(Integer id, String type, String name, String description);

    @Delete("delete from tbl_book where id = #{id}")
    public int deleteById(Integer id);

    @Select("select * from tbl_book")
    public List<Book> selectList();

    @Select("select * from tbl_book limit #{size}")
    public List<Book> selectPage(Integer current, Integer size);

//    @Select("select * from tbl_book where #{column} like #{val}")
//    public List<Book> selectList(String column, String val);
}
