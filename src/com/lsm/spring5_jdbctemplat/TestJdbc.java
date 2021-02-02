package com.lsm.spring5_jdbctemplat;

import com.lsm.spring5_jdbctemplat.entity.Book;
import com.lsm.spring5_jdbctemplat.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {
    @Test
    public void testJdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_mysql_jdbctemplt.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("1");
        book.setUsername("李欢");
        book.setUstatus("在职");
//      bookService.addBook(book);
//      bookService.updateBook(book);
        bookService.deleteBook(book.getUserId());
    }



}
