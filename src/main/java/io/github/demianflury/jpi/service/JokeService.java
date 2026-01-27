package io.github.demianflury.jpi.service;

import io.github.demianflury.jpi.api.model.Joke;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class JokeService {

    // DB connection

    private List<Joke> jokeList;

    public JokeService(){
        jokeList = new ArrayList<>();

        Joke joke1 = new Joke(1, 1, "Your mom is so fat, she falls off both sides of the bed");
        Joke joke2 = new Joke(2, 1, "Your mom is so fat, scientists aren't sure whether she lives on earth or earth lives on her");
        Joke joke3 = new Joke(3, 2, "Why do squirrels swim on their backs? So their nuts don't get wet.");
        Joke joke4 = new Joke(4, 3, "How do you cancel an appointment at the sperm bank? Call them and tell them you can’t cum.");
        Joke joke5 = new Joke(5, 2, "Whats white and hikes up a mountain? A homesick avalanche.");

        jokeList.addAll(Arrays.asList(joke1, joke2, joke3, joke4, joke5));
    }
    public Joke getJoke(int id) {
        for (Joke joke : jokeList) {
            if (id == joke.getId()) {
                return joke;
            }
        }
        return null;
    }
}
