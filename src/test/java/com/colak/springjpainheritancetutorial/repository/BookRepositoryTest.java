package com.colak.springjpainheritancetutorial.repository;

import com.colak.springjpainheritancetutorial.jpa.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private BookRepository repository;

    @Test
    void findById() {
        // select ... from items c where c.item_type='BOOK' and c.id=?
        Optional<Book> optional = repository.findById(1L);
        assertThat(optional).isNotEmpty();
    }
}
