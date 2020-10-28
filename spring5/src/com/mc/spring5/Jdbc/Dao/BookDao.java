package com.mc.spring5.Jdbc.Dao;

import com.mc.spring5.Jdbc.entity.Book;

import java.util.List;

/**
 * Author wangyi
 * Create 2020-10-22 21:04
 * ClassName BookDao
 * Version 1.0
 */
public interface BookDao {
    //新增
    void addbook(Book book);

    //批量新增
    void batchAdd(List<Object  []> batchargs);

    //根据id删除
    void deleteBook(int id);
    //批量删除
    void batchdelete(List<Object  []> batchargs);

    /*根据id修改*/
    void updateBook(Book book);
    //批量修改
    void batchupdate(List<Object  []> batchargs);

    //查询表中数据总数
    int selectbook();

    //查询返回对象
    Book selectone(int id);

    //查询所有
    List<Book> selectall() throws Exception;

}
