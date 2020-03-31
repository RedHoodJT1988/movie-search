package com.galvanize.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;

@SpringBootTest
public class JokeController {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    private JokeService jokeService;

    @Test
    void getAllJokes() throws Exception {
        List<Joke> jokeList = new ArrayList<Joke>();
        jokeList.add(new Joke(id, category, joke));
        jokeList.add(new Joke(id, category, joke));
        when(jokeService.findAll()).thenReturn(jokeList);

        mockMvc.perform(MockMvcRequestBuilders.get("/jokes")
            .contentType(MediaType.APPLICATION_JSON)
        ).andExpect((ResultMatcher) jsonPath("$", hasSize(2))).andDo(print());
    }
}
