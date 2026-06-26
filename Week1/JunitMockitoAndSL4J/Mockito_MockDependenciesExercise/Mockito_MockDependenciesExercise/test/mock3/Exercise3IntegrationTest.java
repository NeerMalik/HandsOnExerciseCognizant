package org.example.mock3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(classes = Exercise3Application.class)
@AutoConfigureMockMvc

class Exercise3IntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Exercise3UserService service;

    @Test
    void testGetUser() throws Exception {

        Exercise3User user =
                new Exercise3User(1L, "John");

        when(service.getUserById(1L))
                .thenReturn(user);

        mockMvc.perform(
                        get("/mock3/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id")
                        .value(1))
                .andExpect(jsonPath("$.name")
                        .value("John"));
    }
}