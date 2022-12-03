package org.example.facadepattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TheaterLights {
	private final String description;

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void dim(int level) {
		System.out.println(description + " dimming to " + level  + "%");
	}

	public String toString() {
		return description;
	}
}
