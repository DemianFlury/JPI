package io.github.demianflury.jpi.service;

import io.github.demianflury.jpi.api.model.Joke;
import io.github.demianflury.jpi.api.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JokeService {

    @Autowired
    private JokeRepository repository;

    public Optional<Joke> getById(int id) {
        return repository.findById(id);
    }

    public Optional<Joke> getRandom() {
        return repository.findRandom();
    }
}
