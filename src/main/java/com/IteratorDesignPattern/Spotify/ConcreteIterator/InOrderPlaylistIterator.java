package com.IteratorDesignPattern.Spotify.ConcreteIterator;

import com.IteratorDesignPattern.Spotify.DataModel.Song;
import com.IteratorDesignPattern.Spotify.IteratorInterface.PlaylistIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class InOrderPlaylistIterator implements PlaylistIterator {
    private List<Song> songList;
    private int position;

    public InOrderPlaylistIterator(List<Song> songList)
    {
        this.songList = songList;
        this.position = 0;
    }


    @Override
    public boolean hasNext() {
        return position < songList.size();
    }

    @Override
    public Song next() {
        if(!hasNext())
        {
            throw new NoSuchElementException();
        }
        return songList.get(position++);
    }
}
