package org.example.mock2;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Exercise2UserServiceTest {

    @Test
    void testGetUserById() {

        Exercise2UserRepository repository =
                mock(Exercise2UserRepository.class);

        Exercise2User user =
                new Exercise2User(1L, "John");

        when(repository.findById(1L))
                .thenReturn(Optional.of(user));

        Exercise2UserService service =
                new Exercise2UserService(repository);

        Exercise2User result =
                service.getUserById(1L);

        assertNotNull(result);
        assertEquals(
                "John",
                result.getName()
        );
    }
}