package com.lsm.spring5_jdbctemplat.dao;

import com.lsm.spring5_jdbctemplat.entity.Book;

import java.util.List;

public interface BookDao {
    public void add(Book book);

    public void updateBook(Book book);

    public void deleteBook(String userId);

    int selectCount();

    Book selectBaObject(String userId);

    List<Book> selectBaList();

    void batchInsertList(List<Object[]> objects);
}
