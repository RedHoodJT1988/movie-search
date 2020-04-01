package com.galvanize.services;

import com.galvanize.entities.Joke;
import com.galvanize.repositories.JokeRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JokeService {
    private JokeRepository jokeRepository;

    public JokeService(@Qualifier("jokeRepository") JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }
    public List<Joke> findAll() {
        return jokeRepository.findAll();
    }
}
