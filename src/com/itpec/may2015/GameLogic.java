package com.itpec.may2015;

public class GameLogic {
	public static GamePlayer checkWinner(GamePlayer player1, GamePlayer player2) {
		GamePlayer winner;
		if (player1.getChoice() == player2.getChoice()) {
			return null;
		} else {
			if (player1.getChoice() < player2.getChoice()) {
				if (Math.abs(player1.getChoice() - player2.getChoice()) == 1) {
					winner = player2;
				} else {
					winner = player1;
				}
			} // player1.getChoice()<player2.getChoice()
			else {
				if (Math.abs(player1.getChoice() - player2.getChoice()) == 1) {
					winner = player1;
				} else {
					winner = player2;
				}
			}
			winner.incScore();
			return winner;
		}
	}
}
