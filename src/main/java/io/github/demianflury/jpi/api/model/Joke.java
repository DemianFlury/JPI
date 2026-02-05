package io.github.demianflury.jpi.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "joke")
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jokeid;

    private int category;
    private String joketext;

    // Constructors
    public Joke() {
    }

    public Joke(int category, String text){
        this.category = category;
        this.joketext = text;
    }


    // Getters
    public int getId(){
        return jokeid;
    }
    public int getCategory(){
        return category;
    }
    public String getText(){
        return joketext;
    }

    // Setters
    public void setCategory(int category){
        this.category = category;
    }
    public void setText(String text){
        this.joketext = text;
    }
}
