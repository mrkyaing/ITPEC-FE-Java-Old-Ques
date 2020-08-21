package com.itpec.may2015;

import java.util.*;

public abstract class Game implements GameLoop {
	protected List<Player> players;

	public Game() {
		players = new ArrayList<Player>();
	}

	public void play() {
		startGame();
	}
}
