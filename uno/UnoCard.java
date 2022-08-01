package uno;

/**
 * 
 */
public class UnoCard {
	
	
	
	private final Color color;
	private final Value value;
	/**
	 * @param color
	 * @param value
	 */
	protected UnoCard(final Color color,final Value value) {
		this.color = color;
		this.value = value;
	}
	/**
	 * @return the color
	 */
	public Color getColor() {
		return this.color;
	}
	/**
	 * @return the value
	 */
	public Value getValue() {
		return this.value;
	}
	
	
	
	@Override
	public String toString() {
		return color + "_"+ value;
	}
	
	
	
    
    

}