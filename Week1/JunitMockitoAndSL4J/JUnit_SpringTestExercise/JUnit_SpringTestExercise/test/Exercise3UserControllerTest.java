package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Exercise3UserController.class)
@ContextConfiguration(classes = Exercise3Application.class)
class Exercise3UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Exercise3UserService userService;

    @Test
    void testGetUser() throws Exception {

        Exercise3User user =
                new Exercise3User(1L, "John");

        when(userService.getUserById(1L))
                .thenReturn(user);

        mockMvc.perform(get("/exercise3/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("John"));
    }
}