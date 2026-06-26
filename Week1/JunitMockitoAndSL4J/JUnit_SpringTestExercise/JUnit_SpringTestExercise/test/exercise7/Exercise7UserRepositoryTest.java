package org.example.exercise7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ContextConfiguration(classes = Exercise7Application.class)
class Exercise7UserRepositoryTest {

    @Autowired
    private Exercise7UserRepository repository;

    @Test
    void testFindByName() {

        repository.save(
                new Exercise7User("John"));

        repository.save(
                new Exercise7User("John"));

        repository.save(
                new Exercise7User("Mike"));

        List<Exercise7User> users =
                repository.findByName("John");

        assertEquals(2, users.size());

        assertEquals(
                "John",
                users.getFirst().getName()
        );
    }
}