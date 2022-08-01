package uno;


import java.util.*;

import javax.swing.ImageIcon;

/**
 * 
 */
public class UnoDeck {
//	private UnoCard[] cards;
//	private int cardsInDeck;
	
    /**
     * Default constructor
     */
//    protected UnoDeck(final Color color,final Value value) 
//    {
//    	super(color, value);
//    	cards = new UnoCard[108];
//    }

//    public void reset() 
//    {
//    	Color[] colors = Color.values();
//    	cardsInDeck = 0;
//    	
//    	
//    	for (int i = 0; i < colors.length-1; i++)
//    	{
//    		Color color = colors[i];
//    		
//    		cards[cardsInDeck++] = new UnoCard(color, Value.getValue(0));
//    		for(int j = 1; j < 10; j++)
//	    		{
//	    			cards[cardsInDeck++] = new UnoCard(color, Value.getValue(j));
//	    			cards[cardsInDeck++] = new UnoCard(color, Value.getValue(j));
//	    		}
//    		
//    		
//    		ArrayList<Value> values = new ArrayList<>(Arrays.asList(Value.DRAWTWO, Value.SKIP, Value.REVERSE));	//ArrayList<Value> instead of Value[]. No errors left.
//    		for (Value value: values)
//    		{
//    			cards[cardsInDeck++] = new UnoCard(color, value);
//    			cards[cardsInDeck++] = new UnoCard(color, value);
//    		}
//    		
//    		
//    		
//    		//add wild cards Wild wild and wild Draw four
//    		Value[] valuesW = new Value[] {Value.WILD, Value.WILD_FOUR};
//    		for (Value value: valuesW)
//    		{
//    			for (int j= 0; j< 4; j++)
//    			{
//    				cards[cardsInDeck++] = new UnoCard(Color.WILD, value);
//    			}
//    		}
//    		
//    		
//    	}	
//    	
//    }
//    /**
//     * 
//     */
//    public void replaceDeckWith(ArrayList<UnoCard> cards) 
//    {
//       this.cards = cards.toArray(new UnoCard[cards.size()]);
//    }
//    									//What do these do exactly?
//    /**
//     * replace the deck with an arraylist of UnoCards (the stockpile)
//     */
//    public void replaceDeckWithStockpile(ArrayList<UnoCard> cards) 	//renamed to stockpile instead of 1
//    {
//       this.cards = cards.toArray(new UnoCard[cards.size()]);
//       this.cardsInDeck = this.cards.length;
//    }

//    /**
//     * @return  true if there are no cards in the deck
//     * 
//     */
//    public boolean isEmpty() 
//    {
//    	if(cardsInDeck == 0)
//    		return true;
//    	else
//    		return false;
//    }

//    /**
//     * shuffle the deck get a random index of the array past the current index 
//     * the argument is an exclusive bound
//     * swap the random element with the present element. 
//     */
//    public void shuffle() {
//        int n = cards.length;
//        Random random = new Random();
//        
//        for (int i = 0; i< cards.length; i++)
//        {
//        	int randomValue = i + random.nextInt(n - i);
//        	UnoCard randomCard = cards[randomValue];
//        	cards[randomValue] = cards[i];
//        	cards[i] = randomCard;
//        }
//    }

//    /**
//     * @param throws IllegalArgumentExceptions
//     */
//    public  UnoCard drawsCard () throws IllegalArgumentException
//    {
//       if (isEmpty()) 
//       {
//    	 throw new IllegalArgumentException("Cannot draw a card since there are no cards in the deck");		
//    	 //What if this doesn't throw an exception and we just use something like replaceDeckWith() to make sure there's always stuff to draw?
//       }
//       return cards[- - cardsInDeck];
//    }

//    /**
//     * @param throws IllegalArgument Exception
//     */
//    public ImageIcon drawCardImage()throws IllegalArgumentException 
//    {
//    	if (isEmpty()) 
//        {
//     	 throw new IllegalArgumentException("Cannot draw a card since the deck is empty");
//        }
//        return new ImageIcon(cards[- - cardsInDeck].toString() + ".png");
//    }

//    /**
//     * @param int n
//     */
//    public UnoCard[] drawCard(int n) 
//    {
//       if (n < 0)
//       {
//    	   throw new IllegalArgumentException("Must draw positive cards but tried to draw" + n + " cards.");
//       }
//       
//       UnoCard[] ret = new UnoCard[n];
//       
//       for(int i = 0; i < n; i++)
//       {
//    	   ret[i] = cards[- - cardsInDeck];
//    	   
//       }
//       return ret;
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Updated version of UnoDeck 
    
    private ArrayList<UnoCard> cards;
	private ArrayList<UnoCard> stockpile;
	
	public UnoDeck() {
		reset();
		shuffle();
	}
	
	//reset the deck to a new deck
	public void reset() {
		//generate an uno deck based off of available card colors/values

		for(Color color: Color.values()) {
			
			//four wilds, four draw fours
			if(color == Color.WILD) {
				for(int i = 0; i < 4; i++) {
					cards.add(new UnoCard(color, Value.WILD));
					cards.add(new UnoCard(color, Value.WILD_FOUR));
				}
			}
			else {
				//Red Blue Green or Yellow
				//two of all of the following for each of the colors: 1-9, skip, reverse, draw two
				for(Value value: Value.values()) {
					if(value != Value.WILD && value != Value.WILD_FOUR) {
						//only one zero of every color
						if(value != Value.ZERO) {
							cards.add(new UnoCard(color, value));
						}
						cards.add(new UnoCard(color, value));
					}
				}
				
			}
	
		}
    	
    	
	}
	
	public boolean isEmpty() {
		return cards.size() == 0;
	}
	
	public void shuffle() {
		Collections.shuffle(cards, new Random());
	}
	
	
// public void shuffle() {
//       int n = cards.length;
//       Random random = new Random();
//       
//       for (int i = 0; i< cards.length; i++)
//       {
//       	int randomValue = i + random.nextInt(n - i);
//       	UnoCard randomCard = cards[randomValue];
//       	cards[randomValue] = cards[i];
//       	cards[i] = randomCard;
//       }
//   }
	
	
	
	//replace the deck with the stockpile
	public void replace() {
		cards.addAll(stockpile);
		stockpile.clear();
	}
	
	public UnoCard drawCard() {
		return cards.remove(0);
	}
	
	public ArrayList<UnoCard> drawCards(int numberOfCards) {
		ArrayList<UnoCard> cards = new ArrayList<>();
		for (int i = 0; i < numberOfCards; i++) {
			cards.add(this.cards.remove(0));
		}
		return cards;
	}

	/**
	 * @return the cards
	 */
	public ArrayList<UnoCard> getCards() {
		return cards;
	}

	/**
	 * @return the stockpile
	 */
	public ArrayList<UnoCard> getStockpile() {
		return stockpile;
	}
    

}



