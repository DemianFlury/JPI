package io.github.demianflury.jpi.api.controller;

import io.github.demianflury.jpi.api.model.Joke;
import io.github.demianflury.jpi.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    @Autowired
    private JokeService jokeService;
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @GetMapping("/joke")
    public Joke getJoke(@RequestParam int id){
        return jokeService.getJoke(id);
    }
}
