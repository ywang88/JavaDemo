package com.mc.spring5.Jdbc.Dao;

import com.mc.spring5.Jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Author wangyi
 * Create 2020-10-22 21:05
 * ClassName BookDaoImpl
 * Version 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {
    //注入jdbcTemplate对象
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addbook(Book book) {
        //创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        //调用方法实现
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void batchAdd(List<Object[]> batchargs) {
        //创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchargs);
        System.out.println(Arrays.toString(ints));
    }

    //根据id删除
    @Override
    public void deleteBook(int id) {
        //创建sql语句
        String sql = "DELETE FROM t_book WHERE user_id= ?";
        Object[] args = {id};
        //调用方法实现
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //批量删除
    @Override
    public void batchdelete(List<Object[]> batchargs) {
        String sql = "DELETE FROM t_book WHERE user_id= ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchargs);
        System.out.println(Arrays.toString(ints));
    }


    @Override
    public void updateBook(Book book) {
        //创建sql语句
        String sql = "update  t_book set username=?, ustatus=? WHERE user_id= ? ";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        //调用方法实现
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    //批量更新
    @Override
    public void batchupdate(List<Object[]> batchargs) {
        String sql = "update  t_book set username=?, ustatus=? WHERE user_id= ? ";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchargs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public int selectbook() {
        //创建sql语句
        String sql = "SELECT count(*) from t_book";
        //调用方法实现
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book selectone(int id) {
        //创建sql语句
        String sql = "select * from t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> selectall() throws Exception {
        //创建sql语句
        String sql = "select * from t_book";
        List<Book> booklist = (List<Book>) jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return booklist;
    }


}
