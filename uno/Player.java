package uno;

import java.util.ArrayList;

public class Player {

	private static int players = 0;
	private int playerNumber;
	private ArrayList<UnoCard> hand;
	
	public Player(ArrayList<UnoCard> startingHand) {
		this.playerNumber = players;
		players++;
		this.hand = startingHand;
	}

	/**
	 * @return the playerNumber
	 */
	public int getPlayerNumber() {
		return playerNumber;
	}

	/**
	 * @return the hand
	 */
	public ArrayList<UnoCard> getHand() {
		return hand;
	}
	
	public void drawCard(UnoCard card) {
		hand.add(card);
	}
	
	public int getHandSize() {
		return hand.size();
	}
	
	public UnoCard playCard(int index) {
		return hand.remove(index);
	}
}
