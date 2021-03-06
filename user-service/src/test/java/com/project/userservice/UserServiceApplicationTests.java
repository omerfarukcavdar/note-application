package com.project.userservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserServiceApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreateUser() throws Exception{
		String json = "{\"name\":\"Omer\",\"email\":\"o.f.cavdar10@gmail.com\"}";
		mockMvc.perform(post("/user").contentType(MediaType.APPLICATION_JSON).content(json)).andExpect(status().is2xxSuccessful());
	}

	@Test
	public void testFindUserById() throws Exception{
		String expected = "{\"id\":\"5da7bc0dfe36a2299ddc91f8\",\"name\":\"Omer\",\"email\":\"o.f.cavdar10@gmail.com\"}";
		mockMvc.perform(get("/user/5da7bc0dfe36a2299ddc91f8").contentType(MediaType.APPLICATION_JSON)).andExpect(content().string(containsString(expected)));
	}

}
