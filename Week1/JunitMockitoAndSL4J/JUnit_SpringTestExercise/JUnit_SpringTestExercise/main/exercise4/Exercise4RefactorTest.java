package org.example.exercise4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(
        classes = Exercise4Application.class,
        webEnvironment = WebEnvironment.RANDOM_PORT)
class Exercise4IntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private Exercise4UserRepository repository;

    @Test
    void testFullFlow() {

        Exercise4User savedUser =
                repository.save(
                        new Exercise4User("John"));

        Exercise4User result =
                restTemplate.getForObject(
                        "http://localhost:" +
                                port +
                                "/exercise4/users/" +
                                savedUser.getId(),
                        Exercise4User.class);

        assertNotNull(result);
        assertEquals("John",
                result.getName());
    }
}