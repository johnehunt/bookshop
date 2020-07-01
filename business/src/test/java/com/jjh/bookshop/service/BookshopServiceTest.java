package com.jjh.bookshop.service;

import com.jjh.bookshop.domain.Book;
import com.jjh.bookshop.repository.BookRepoTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes= {BookRepoTestConfig.class, BookshopServiceTestConfig.class})
class BookshopServiceTest {

    @Autowired
    private BookshopService bookshop;

    @Test
    public void testBookshopGetAllBooks() {
        List<Book> books = bookshop.getAllBooks();
        assertTrue(books.size() > 0, "Should be 1 or more books returned");
    }

}