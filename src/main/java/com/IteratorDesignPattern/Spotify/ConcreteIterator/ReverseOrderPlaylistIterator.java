package com.IteratorDesignPattern.Spotify.ConcreteIterator;

import com.IteratorDesignPattern.Spotify.DataModel.Song;
import com.IteratorDesignPattern.Spotify.IteratorInterface.PlaylistIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ReverseOrderPlaylistIterator implements PlaylistIterator {
    private List<Song> songList;
    private int position;

    public ReverseOrderPlaylistIterator(List<Song> songList)
    {
        this.songList = songList;
        this.position = songList.size()-1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Song next() {
        if(!hasNext())
        {
            throw new NoSuchElementException();
        }
        return songList.get(position--);
    }
}
