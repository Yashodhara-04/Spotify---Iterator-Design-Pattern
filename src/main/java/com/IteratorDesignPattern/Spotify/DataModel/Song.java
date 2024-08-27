package com.IteratorDesignPattern.Spotify.DataModel;

public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist)
    {
        this.title = title;
        this.artist = artist;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public String toString()
    {
        return "Title: "  + this.title + " Author : " + this.artist;
    }
}
