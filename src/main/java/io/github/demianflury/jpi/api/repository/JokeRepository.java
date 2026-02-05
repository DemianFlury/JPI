package io.github.demianflury.jpi.api.repository;

import io.github.demianflury.jpi.api.model.Joke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JokeRepository extends JpaRepository<Joke, Integer> {

    @Query(value = "SELECT * FROM joke ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    public Optional<Joke> findRandom();

}