package exceptions;

public class FirstnameOrLastnameNotFound extends Exception{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public FirstnameOrLastnameNotFound(String message) {
super(message);
	}
	    
	 
	   public String toString(){
	     return ("CustomExceptio[first name and last name is must]") ;
	  }
}
