package org.example.exercise6;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class Exercise6UserServiceTest {

    @Test
    void testUserNotFound() {

        Exercise6UserRepository repository =
                mock(Exercise6UserRepository.class);

        when(repository.findById(1L))
                .thenReturn(Optional.empty());

        Exercise6UserService service =
                new Exercise6UserService(repository);

        NoSuchElementException exception =
                assertThrows(
                        NoSuchElementException.class,
                        () -> service.getUserById(1L)
                );

        assertEquals(
                "User not found",
                exception.getMessage()
        );
    }
}