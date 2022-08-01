package uno;


/**
 * 
 */
public enum Value {
	ZERO,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    REVERSE,
    DRAWTWO,
    SKIP,
    WILD,
    WILD_FOUR;
	
    private static final Value[] values = Value.values();
    
    
    public static Value getValue(int i)
    {
    	return Value.values[i];
    }
}