package com.IteratorDesignPattern.Spotify.AggregateInterface;

import com.IteratorDesignPattern.Spotify.IteratorInterface.PlaylistIterator;

public interface PlaylistAggregate {
    public PlaylistIterator createInOrderIterator();
    public PlaylistIterator createReverseIterator();
    public PlaylistIterator shuffleReverseIterator();
}
