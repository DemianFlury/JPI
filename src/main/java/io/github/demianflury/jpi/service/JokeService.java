package io.github.demianflury.jpi.service;

import io.github.demianflury.jpi.api.model.Joke;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class JokeService {

    public JokeService(){
        Joke jokeModel = new Joke()
    }
    public Joke getJokeById(int id) {
        for (Joke joke : jokeList) {
            if (id == joke.getId()) {
                return joke;
            }
        }
        return null;
    }
}
