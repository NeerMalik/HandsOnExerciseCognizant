package org.example.exercise8;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(Exercise8UserController.class)
@Import({
        Exercise8UserService.class,
        GlobalExceptionHandler.class
})
class Exercise8ControllerExceptionTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testExceptionHandling() throws Exception {

        mockMvc.perform(
                        get("/exercise8/users/1"))
                .andExpect(
                        status().isNotFound())
                .andExpect(
                        content().string(
                                "User not found"));
    }
}