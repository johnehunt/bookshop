package com.jjh.bookshop.repository;

import com.jjh.bookshop.domain.Book;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes=BookRepoTestConfig.class)
class BookRepositoryTest {

    @Autowired
    BookRepository repository;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
    }
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("In setup");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("In tearDown");
    }

    @Test
    public void testFindByID() {
        String isbn = "1";
        Optional<Book> optionalBook = repository.findById(isbn);
        assertEquals(optionalBook.get().getISBN(), isbn, "ISBN should be " + isbn);
    }

    @Test
    public void testFIndALlBooks() {
        List<Book> books = (List<Book>) repository.findAll();
        assertTrue(books.size() > 0, "Should be 1 or more books returned");
    }

}