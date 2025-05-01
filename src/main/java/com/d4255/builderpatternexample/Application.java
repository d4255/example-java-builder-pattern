package com.d4255.example_java_builder_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Song song = new Song.Builder().withId("1")
							  .withTitle("The Chain")
							  .withArtist("Fleetwood Mac")
							  .withAlbum("Rumours")
							  .withGenre("Rock")
							  .withYear(1977)
							  .withDuration(268)
							  .build();

	}

}
