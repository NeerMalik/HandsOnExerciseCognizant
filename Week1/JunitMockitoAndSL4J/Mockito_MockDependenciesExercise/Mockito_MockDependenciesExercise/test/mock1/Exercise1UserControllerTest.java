package org.example.mock1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(Exercise1UserController.class)
@ContextConfiguration(classes = Exercise1Application.class)
class Exercise1UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Exercise1UserService userService;

    @Test
    void testGetUser() throws Exception {

        Exercise1User user =
                new Exercise1User(1L, "John");

        when(userService.getUserById(1L))
                .thenReturn(user);

        mockMvc.perform(
                        get("/mock1/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id")
                        .value(1))
                .andExpect(jsonPath("$.name")
                        .value("John"));
    }
}