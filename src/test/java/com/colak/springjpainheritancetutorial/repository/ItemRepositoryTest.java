package com.colak.springjpainheritancetutorial.repository;

import com.colak.springjpainheritancetutorial.jpa.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ItemRepositoryTest {
    @Autowired
    private ItemRepository repository;

    @Test
    void findById() {
        // select ... from items c where c.id=?
        Optional<Item> optional = repository.findById(1L);
        assertThat(optional).isNotEmpty();
        assertThat(optional.get().getItemType()).isEqualTo("BOOK");
    }
}
