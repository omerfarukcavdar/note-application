package com.project.noteservice;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class NoteServiceIntegrationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	@Ignore
	@Test
	public void testCreateNote() throws Exception {
		String json = "{\"noteContent\":\"Example Note\",\"userId\":\"0\"}";
		mockMvc.perform(post("/note").contentType(MediaType.APPLICATION_JSON).content(json)).andExpect(status().is2xxSuccessful());
	}

	@Ignore
	@Test
	public void testUpdateNote() throws Exception{
        String json = "{\"noteContent\":\"Example Note2\",\"userId\":\"0\",\"id\":\"5da79c21fe36a2129db664ef\"}";
        mockMvc.perform(post("/note/5da79c21fe36a2129db664ef").contentType(MediaType.APPLICATION_JSON).content(json)).andExpect(status().is2xxSuccessful());
    }

}
