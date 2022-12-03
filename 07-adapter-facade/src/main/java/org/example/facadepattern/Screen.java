package org.example.facadepattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Screen {
	private final String description;

	public void up() {
		System.out.println(description + " going up");
	}

	public void down() {
		System.out.println(description + " going down");
	}

	public String toString() {
		return description;
	}
}
