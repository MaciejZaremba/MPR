package com.example.MPR_SPRING_1.model;

public class Games {
    private String name;
    private String genre;

    public Games(String name, String genre)
    {
        this.name = name;
        this.genre = genre;
    }

    public String getName()
    {
        return name;
    }
    public String getGenre()
    {
        return genre;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
