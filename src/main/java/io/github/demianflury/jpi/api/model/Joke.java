package io.github.demianflury.jpi.api.model;

public class Joke {
    private int id;
    private int category;
    private String text;

    // Constructors
    public Joke(int id, int category, String text){
        this.id = id;
        this.category = category;
        this.text = text;
    }


    // Getters
    public int getId(){
        return id;
    }
    public int getCategory(){
        return category;
    }
    public String getText(){
        return text;
    }

    // Setters
    public void setCategory(int category){
        this.category = category;
    }
    public void setText(String text){
        this.text = text;
    }
}
