package uno;

/**
 * 
 */
public class InvalidPlayerTurnException extends Exception {

	private static final long serialVersionUID = -4995729818936958670L;

	/**
     * Default constructor
     */
    public InvalidPlayerTurnException(String errorMessage){
    	super(errorMessage);
    }

    /**
     * 
     */
    private String playerID;

    /**
     * @param String message 
     * @param String pid
     */
    protected InvalidPlayerTurnException(String message, String pid) {
        // TODO implement here
    }

    /**
     * 
     */
    public String getPid() {		//class doesnt have a pid. implement?
        // TODO implement here
    	return null;
    }

}