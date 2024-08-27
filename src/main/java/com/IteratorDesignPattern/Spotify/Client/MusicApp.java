package com.IteratorDesignPattern.Spotify.Client;

import com.IteratorDesignPattern.Spotify.AggregateClass.Playlist;
import com.IteratorDesignPattern.Spotify.ConcreteIterator.InOrderPlaylistIterator;
import com.IteratorDesignPattern.Spotify.DataModel.Song;
import com.IteratorDesignPattern.Spotify.IteratorInterface.PlaylistIterator;

import java.util.List;
import java.util.Scanner;

public class MusicApp {
    Scanner scanner = new Scanner(System.in);
    Playlist playlist = new Playlist();

    public void runApplication()
    {
        Playlist playlist = new Playlist();
        playlist.setSong(new Song("Piya1", "a1"));
        playlist.setSong(new Song("Piya2", "a2"));
        playlist.setSong(new Song("Piya3", "a3"));
        playlist.setSong(new Song("Piya4", "a4"));

        PlaylistIterator inOrderIterator = playlist.createInOrderIterator();
        System.out.println("InOrderIterator: ");
        while(inOrderIterator.hasNext())
        {
            System.out.println(inOrderIterator.next().toString());
        }

        PlaylistIterator reverseIterator = playlist.createReverseIterator();
        System.out.println("ReverseIterator: ");
        while(reverseIterator.hasNext())
        {
            System.out.println(reverseIterator.next().toString());
        }

        PlaylistIterator shuffleIterator = playlist.shuffleReverseIterator();
        System.out.println("ShuffleIterator: ");
        while(shuffleIterator.hasNext())
        {
            System.out.println(shuffleIterator.next().toString());
        }

    }
}
