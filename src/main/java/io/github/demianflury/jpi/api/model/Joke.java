package io.github.demianflury.jpi.api.model;

public class Joke {
    private int id;
    private int category;
    private String joketext;

    // Constructors
    public Joke(int id, int category, String text){
        this.id = id;
        this.category = category;
        this.joketext = text;
    }


    // Getters
    public int getId(){
        return id;
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
