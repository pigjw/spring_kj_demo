package com.lsm.inject_attribute_set;

/**
 * 演示spring注入属性
 */
public class BookTest {
    private String bookName;

    private String bookAuthor;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "BookTest{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
