package org.example;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Test
    void testGetUserById() {
        UserRepository mockRepository = mock(UserRepository.class);

        User user = new User();
        user.setId(1L);
        user.setName("John");

        when(mockRepository.findById(1L))
                .thenReturn(Optional.of(user));

        UserService userService =
                new UserService(mockRepository);

        User result = userService.getUserById(1L);

        assertEquals("John", result.getName());
    }
}