package com.IteratorDesignPattern.Spotify.IteratorInterface;


import com.IteratorDesignPattern.Spotify.DataModel.Song;

public interface PlaylistIterator {

    public boolean hasNext();
    public Song next();
}
