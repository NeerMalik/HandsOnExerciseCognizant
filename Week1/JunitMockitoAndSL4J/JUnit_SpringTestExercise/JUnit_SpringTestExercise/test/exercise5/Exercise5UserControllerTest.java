package org.example.exercise5;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.ArgumentMatchers.any;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(Exercise5UserController.class)
@ContextConfiguration(classes = Exercise5Application.class)
class Exercise5UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private Exercise5UserService userService;

    @Test
    void testCreateUser() throws Exception {

        Exercise5User user =
                new Exercise5User(1L, "John");

        when(userService.saveUser(any(Exercise5User.class)))
                .thenReturn(user);

        mockMvc.perform(
                        post("/exercise5/users")
                                .contentType("application/json")
                                .content(
                                        objectMapper
                                                .writeValueAsString(user)
                                )
                )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id")
                        .value(1))
                .andExpect(jsonPath("$.name")
                        .value("John"));
    }
}