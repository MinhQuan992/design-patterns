package org.example.facadepattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PopcornPopper {
	private final String description;
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public void pop() {
		System.out.println(description + " popping popcorn!");
	}
 
	public String toString() {
                return description;
        }
}
