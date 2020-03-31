package com.galvanize.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
public class JokeController {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    private JokeService jokeService;
}
