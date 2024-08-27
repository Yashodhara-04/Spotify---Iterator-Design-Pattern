package com.IteratorDesignPattern.Spotify.AggregateClass;

import com.IteratorDesignPattern.Spotify.AggregateInterface.PlaylistAggregate;
import com.IteratorDesignPattern.Spotify.ConcreteIterator.InOrderPlaylistIterator;
import com.IteratorDesignPattern.Spotify.ConcreteIterator.ReverseOrderPlaylistIterator;
import com.IteratorDesignPattern.Spotify.ConcreteIterator.ShufflePlaylistIterator;
import com.IteratorDesignPattern.Spotify.DataModel.Song;
import com.IteratorDesignPattern.Spotify.IteratorInterface.PlaylistIterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements PlaylistAggregate {
    private List<Song> songList;

    public Playlist()
    {
        this.songList = new ArrayList<>();
    }

    public void setSong(Song song)
    {
        songList.add(song);
    }

    public List<Song> getSongs()
    {
        return  songList;
    }


    @Override
    public PlaylistIterator createInOrderIterator() {
        return new InOrderPlaylistIterator(songList);
    }

    @Override
    public PlaylistIterator createReverseIterator() {
        return new ReverseOrderPlaylistIterator(songList);
    }

    @Override
    public PlaylistIterator shuffleReverseIterator() {
        return new ShufflePlaylistIterator(songList);
    }
}
