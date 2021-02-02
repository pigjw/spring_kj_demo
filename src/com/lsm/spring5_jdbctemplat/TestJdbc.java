package com.lsm.spring5_jdbctemplat;

import com.lsm.spring5_jdbctemplat.entity.Book;
import com.lsm.spring5_jdbctemplat.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestJdbc {
    @Test
    public void testJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_mysql_jdbctemplt.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("2");
        book.setUsername("李欢");
        book.setUstatus("在职");
//        bookService.addBook(book);
//        bookService.updateBook(book);
//        bookService.deleteBook(book.getUserId());
//            bookService.selectCount();
//        Book bookBack = bookService.selectBaObject("1");
//        List<Book> books = bookService.selectBaList();
//        System.out.println(books);
//        Object[] o1 = {"1","c#","1"};
//        Object[] o2 = {"2","c#","2"};
//        Object[] o3 = {"3","c#","3"};
//        List<Object[]> list = new ArrayList<>();
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//        bookService.batchInsertList(list);
//        bookService.batchUpdateList(list);
        Object[] o1 = {"1"};
        Object[] o2 = {"2"};
        Object[] o3 = {"3"};
        List<Object[]> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        bookService.batchDeleteList(list);
    }



}
