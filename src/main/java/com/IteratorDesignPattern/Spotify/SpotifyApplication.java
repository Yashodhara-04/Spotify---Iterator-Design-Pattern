package com.IteratorDesignPattern.Spotify;

import com.IteratorDesignPattern.Spotify.Client.MusicApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpotifyApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpotifyApplication.class, args);
		MusicApp musicApp = new MusicApp();
		musicApp.runApplication();
	}

}
