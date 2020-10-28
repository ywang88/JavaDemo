package com.mc.spring5.Jdbc.Service;

import com.mc.spring5.Jdbc.Dao.BookDao;
import com.mc.spring5.Jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author wangyi
 * Create 2020-10-22 21:04
 * ClassName BookService
 * Version 1.0
 */
@Service
public class BookService {
    //注入bookDao对象
    @Autowired
    private BookDao bookDao;

    public void addbook(Book book) {
        bookDao.addbook(book);
    }

    public void updatebook(Book book) {
        bookDao.updateBook(book);
    }

    public void deletebook(int id) {
        bookDao.deleteBook(id);
    }

    public int selectbook() {
        return bookDao.selectbook();
    }

    public Book selectone(int id) {
        return bookDao.selectone(id);
    }

    public List<Book> selectall() throws Exception {
        return bookDao.selectall();
    }

    public void batchAdd(List<Object[]> batchargs) {
        bookDao.batchAdd(batchargs);
    }

    public void batchupdate(List<Object[]> batchargs) {
        bookDao.batchupdate(batchargs);
    }

    public void batchdelete(List<Object[]> batchargs) {
        bookDao.batchdelete(batchargs);
    }
}
