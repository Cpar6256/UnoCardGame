package uno;


/**
 * This Enum will contain all of our colors for the different types of card. This never changes so It's easier to do it this way.
 */
public enum Color 
{
    RED,
    BLUE,
    GREEN,
    YELLOW,
    WILD;
    public static final Color[] colors = Color.values();
    
    public static Color getColor(int i) 
    {
    	return Color.colors[i];
    }
	
	
}