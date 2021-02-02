package com.lsm.spring5_jdbctemplat.dao;

import com.lsm.spring5_jdbctemplat.entity.Book;
public interface BookDao {
    public void add(Book book);

    public void updateBook(Book book);

    public void deleteBook(String userId);
}
