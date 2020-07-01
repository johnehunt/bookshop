package com.jjh.bookshop.controller;

import com.jjh.bookshop.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes= {BookshopControllerTestConfig.class})
class BookshopControllerTest {

    @Autowired
    private BookshopController controller;

    @Test
    public void testGetBookByISBN() {
        Book book = controller.getBook("1");
        assertNotNull(book, "Book should not be null");
        assertEquals(book.getISBN(), "1");
    }

}