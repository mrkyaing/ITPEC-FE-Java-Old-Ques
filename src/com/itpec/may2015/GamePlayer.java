package com.itpec.may2015;

public class GamePlayer extends Player {
	
	private int choice;

	public GamePlayer(String name) {
		super(name);
	}

	public void incScore() {
		setScore(getScore() + 1);
	}

	public int getChoice() {
		return this.choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}
}
