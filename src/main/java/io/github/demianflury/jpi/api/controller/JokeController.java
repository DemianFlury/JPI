package io.github.demianflury.jpi.api.controller;

import io.github.demianflury.jpi.api.model.Joke;
import io.github.demianflury.jpi.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/joke")
public class JokeController {

    @Autowired
    private JokeService jokeService;
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    private ResponseEntity<Joke> checkOptional(Optional<Joke> result){
        if(result.isEmpty()){

            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(result.get());
        }
    }
    // Get joke by ID
    @GetMapping("/{id}")
    public ResponseEntity<Joke> findById(@PathVariable int id){
        Optional<Joke> result = jokeService.getById(id);
        return checkOptional(result);
    }

    // Get random joke
    @GetMapping
    public ResponseEntity<Joke> findRandom(){
        Optional<Joke> result = jokeService.getRandom();
        return checkOptional(result);
    }
    // Get joke by category
}
