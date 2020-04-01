package com.galvanize.controllers;

import com.galvanize.entities.Joke;
import com.galvanize.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JokeController {
    @Autowired
    private JokeService jokeService;

    @GetMapping("/jokes")
    ResponseEntity<List<Joke>> getAllJokes() {
        return new ResponseEntity<>(jokeService.findAll(), HttpStatus.OK);
    }
}
