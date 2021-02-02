package com.lsm.spring5_jdbctemplat.dao;

import com.lsm.spring5_jdbctemplat.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{
    //注入jdbcJdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //1.创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        //2.调用方法实现
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void updateBook(Book book) {
        //1.创建sql语句
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        //2.调用方法实现
        Object[] args = {book.getUsername(), book.getUstatus(), Integer.valueOf(book.getUserId())};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void deleteBook(String userId) {
        //1.创建sql语句
        String sql = "delete from t_book where user_id = ?";
        //2.调用方法实现
        Object[] args = {userId};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        //1.创建sql语句
        String sql = "select count(*) from t_book";
        //2.调用方法实现
//        Object[] args = {userId};
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
        return count;
    }

    @Override
    public Book selectBaObject(String userId) {
        //1.创建sql语句
        String sql = "select * from t_book where user_id=?";
        //2.调用方法实现
        Object[] args = {userId};
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),args);
        return book;
    }

    @Override
    public List<Book> selectBaList() {
        //1.创建sql语句
        String sql = "select * from t_book";
        //2.调用方法实现
//        Object[] args = {userId};
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchInsertList(List<Object[]> objects) {
        //1.创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        //2.调用方法实现
        int[] intArray = jdbcTemplate.batchUpdate(sql, objects);
//        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
//        int update = jdbcTemplate.update(sql, args);
        System.out.println(intArray);
    }

    @Override
    public void batchUpdateList(List<Object[]> objects) {
        //1.创建sql语句
        String sql = "update  t_book set username = ? ,ustatus = ? where user_id=?";
        //2.调用方法实现
        int[] intArray = jdbcTemplate.batchUpdate(sql, objects);
//        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
//        int update = jdbcTemplate.update(sql, args);
        System.out.println(intArray);
    }

    @Override
    public void batchDeleteList(List<Object[]> objects) {
        //1.创建sql语句
        String sql = "delete from t_book  where user_id=?";
        //2.调用方法实现
        int[] intArray = jdbcTemplate.batchUpdate(sql, objects);
//        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
//        int update = jdbcTemplate.update(sql, args);
        System.out.println(intArray);
    }


}
