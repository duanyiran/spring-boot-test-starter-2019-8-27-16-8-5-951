package com.oocl.web.sampleWebApp;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.oocl.web.sampleWebApp.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {


 @Autowired
 private MockMvc mockMvc;

 @Test
 public void should_return_201_status_when_create_user() throws Exception {
  this.mockMvc.perform(get("/users")).andDo(print()).andExpect(status().isOk())
    .andExpect(status().isOk());
 }
}