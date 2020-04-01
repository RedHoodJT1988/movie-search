package com.galvanize.repositories;

import com.galvanize.entities.Joke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jokeRepository")
public interface JokeRepository extends JpaRepository<Joke, Long> {

}