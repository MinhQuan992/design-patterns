package org.example.facadepattern;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Amplifier {
	private final String description;
	private Tuner tuner;
	private StreamingPlayer player;
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
 
	public void setStereoSound() {
		System.out.println(description + " stereo mode on");
	}
 
	public void setSurroundSound() {
		System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
	}
 
	public void setVolume(int level) {
		System.out.println(description + " setting volume to " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " setting tuner to " + tuner);
		this.tuner = tuner;
	}
  
	public void setPlayer(StreamingPlayer player) {
		System.out.println(description + " setting Streaming player to " + player);
		this.player = player;
	}
 
	public String toString() {
		return description;
	}
}
