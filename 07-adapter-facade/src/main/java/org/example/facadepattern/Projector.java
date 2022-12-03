package org.example.facadepattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Projector {
	private final String description;
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public void wideScreenMode() {
		System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
	}

	public void tvMode() {
		System.out.println(description + " in tv mode (4x3 aspect ratio)");
	}
  
	public String toString() {
                return description;
        }
}
