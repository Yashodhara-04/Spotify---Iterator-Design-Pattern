package com.IteratorDesignPattern.Spotify.ConcreteIterator;

import com.IteratorDesignPattern.Spotify.DataModel.Song;
import com.IteratorDesignPattern.Spotify.IteratorInterface.PlaylistIterator;

import java.util.*;

public class ShufflePlaylistIterator implements PlaylistIterator {
    private List<Song> shuffledList;
    private int position;

    public ShufflePlaylistIterator(List<Song> songList)
    {
        this.shuffledList = new ArrayList<>(songList);
        Collections.shuffle(shuffledList,new Random());
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < shuffledList.size();
    }

    @Override
    public Song next() {
        if(!hasNext())
        {
            throw new NoSuchElementException();
        }
        return shuffledList.get(position++);
    }
}
