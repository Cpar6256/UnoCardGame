package uno;

import java.util.*;

import javax.swing.ImageIcon;

/**
 * 
 */
public class Game {
	private int currentPlayer;
	private Player[] players;
	private UnoDeck deck;
	private boolean gameDirection;

    /**
     * Default constructor
     */

    public Game(int numberOfPlayers) {
		deck = new UnoDeck();
		
		//generate players
		players = new Player[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++) {
			players[i] = new Player(deck.drawCards(7));
		}
		
		currentPlayer = 0;
		gameDirection = true;
	}
	
    public boolean isGameOver() {	
    	
    	for(Player player: players) {
    		if(player.getHandSize() == 0) {
    			return true;
    		}
    	}
    	return false;
    }
	
	public int getCurrentPlayer() {
		return currentPlayer;
	}
	
	public void playerPlaysCard(Player player, UnoCard card) {
		if (!validCardPlay(card)) {
			//throw error
		}
		
		//do things like reverse, skip, draw cards
	}
	
	public void playerDrawsCard(Player player, UnoCard card) {
		player.drawCard(card);
	}
	
	//check if the color or value of the card matches the top card on the stockpile
	public boolean validCardPlay(UnoCard card) {
		UnoCard stockPileTopCard = deck.getStockpile().get(0);
		
		if (card.getColor() == Color.WILD) {
			return true;
		}
		else if (card.getColor() == stockPileTopCard.getColor()
				|| card.getValue() == stockPileTopCard.getValue()) {
			return true;
		}
		else {
			return false;
		}
	}
    
    
    
    
//    private int currentPlayer = 0;	//removed void before int, replaced Int with int. defaulted it to 0
//    private String[] playerIds; //replaced void with String[], removed String[]; at the end. is this pids?
//    private UnoDeck deck;	//replaced void with UnoDeck, removed UnoDeck; at the end
//    private ArrayList<UnoCard> playerHand;	//replaced void with ArrayList<UnoCard>, removed "ArrayList UnoCard;" at the end
//    private ArrayList<UnoCard> stockpile;	//what is this function's purpose?

    //I commented these out because only used once
    /*
    private Color validColor; //replaced void with Color, removed UnoCard.Color at the end

    private Value validValue;	//replaced void with Value, removed UnoCard.Value; at the end
    */
    
    /**
     * 
     */
   // public boolean gameDirection; //make a function somewhere for the VALUE.REVERSE

    /**
     * @param String[] pids
     */
//    public Game(String[] pids) {	//removed void in "(void String[]...)	is this a constructor? it looks like it's supposed to be. removed all void keywords
// 
//    	playerIds = pids;
//    }

    /**
     * @param Game game
     */
//    public void start(Game game) {	//removed void in the same place. 			//main function in UnoApp class uses this function?
//        // TODO implement here
//    	
//    	//give current player a turn, have a card already on the "top". 
//    	//Might want to randomize the currentplayer. 
//    }

    /**
     * 
     */
//    public UnoCard getTopCard() {	//removed void
//    	
//    	return this.deck.drawsCard();
//    }

    /**
     * 
     */
//    public ImageIcon getTopCardImage() {	//imported ImageIcon, removed void
//        
//    	return this.deck.drawCardImage();
//    }

    /**
     * 
     */
    

    /**
     * 
     */
//    public int getCurrentPlayer(int currentPlayer) {	//removed void
//        	
//    	return this;
//    	
//    }

   

	/**
     * 
     */
//    public String getNextPlayer() {				//Changed it to getNextPlayer instead of previous player
//        return this;
//    }
//
//    /**
//     * 
//     */
//    public String[] getPlayers() {
//        // TODO implement here
//    	return playerIds;
//    }

    /**
     * @param String pid
     */
//    public ArrayList<UnoCard> getPlayerHand(String pid) {
//        // TODO implement here
//    	return null;
//    }
//
//    /**
//     * @param String pid
//     */
//    public int getPlayerHandSize(String pid) {
//        return getPlayerHand(pid).size();
//    }

    /**
     * @param String pin 
     * @param int choice
     */
//    public UnoCard getPlayerCard(String pin, int choice) {
//        // TODO implement here
//    	return null;
//    }

    /**
     * @param UnoCard card
     */
//    public boolean validCardPlay(UnoCard card) {
//        if(card.getColor().equals( getTopCard().getColor() ) || card.getValue().equals(getTopCard().getValue() )) {
//        	return true;
//        } else if(card.getValue().equals(Value.WILD) || card.getValue().equals(Value.WILD_FOUR)) {
//        	return true;
//        } else {
//        	return false;
//        }
//        	
//    }

    /**
     * @param String pid
     */
//    public void checkPlayerTurn(String pid) {		//Don't know how this is meant to work
//        // TODO implement here
//    }
//
//    /**
//     * @param String pid
//     */
//    public void submitDraws(String pid) {
//        // TODO implement here
//    }
//
//    /**
//     * @param Color color
//     */
//    public void setCardColor(Color color) {			//GUI for wildcards, when you put down a wildcard you are shown colors and click the one you want
//        // TODO implement here
//    }
//
//    /**
//     * @param String pid 
//     * @param UnoCard card 
//     * @param Color declareColor
//     */
//    public void submitPlayerCard(String pid, UnoCard card, Color declareColor) {		
//        // TODO implement here
//    }
}