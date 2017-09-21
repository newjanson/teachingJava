package javatutorial;

public class Class1 {

/* This class contains static fields and functions and therefore
	can't make a new instance of it in JavaDemo
	*/
	public static String dummyString;
	private String localVariable;
	private final double constantValue = 0.01; // the variable of final constants should
										// start with a lowercase k. You can only set
										// the value of a final variable ONCE (when you declare it)
	public String getTheValueOflocalVariable(){ // this function is a String because it returns a string
		return this.localVariable; // Best practices to specify this. when talking about
									// private variables because it clears confusion for reasons 
									// explained in setTheValueOflocalVariable()
	}
	public void setTheValueOflocalVariable(String localVariable){
		this.localVariable = localVariable; // sets the value of the private localVariable declared above
											// to whatever is inputed to the function
	}
	private void iCanChangedummyString(String dummyString){
		Class1.dummyString = dummyString;
		// equivalent to
		this.dummyString = dummyString;
		// because we are inside Class1
	}

}
