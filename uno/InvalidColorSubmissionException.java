package uno;

/**
 * 
 */
public class InvalidColorSubmissionException extends Exception {

    private static final long serialVersionUID = 1L;	//default generated
	//The serializable class InvalidColorSubmissionException does not declare a static final serialVersionUID field of type long

	/**
     * Default constructor
     */
    public InvalidColorSubmissionException(String errorMessage){
    	super(errorMessage);
    }

    /**
     * 
     */
    private Color exp;	//renamed from expected to exp

    /**
     * 
     */
    private Color act;	//renamed from actual to act

    /**
     * @param String message 
     * @param Color actual 
     * @param Color expected
     */
    protected InvalidColorSubmissionException(String message, Color actual, Color expected) {
        // TODO implement here
    	exp = expected;
    	act = actual;
    }

    /**
     * 
     */
    public void Operation1() {		//What's this for?
        // TODO implement here
    }

}