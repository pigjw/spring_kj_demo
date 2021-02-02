package com.lsm.spring5_jdbctemplat.service;

import com.lsm.spring5_jdbctemplat.dao.BookDao;
import com.lsm.spring5_jdbctemplat.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService  {
    //注入dao
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }


    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    public void deleteBook(String userId){
        bookDao.deleteBook(userId);
    }

    public int selectCount(){
      return bookDao.selectCount();
    }

    public Book selectBaObject(String userId){
        return bookDao.selectBaObject(userId);
    }

    public List<Book> selectBaList(){
        return bookDao.selectBaList();
    }


}
