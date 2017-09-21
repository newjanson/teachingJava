package javatutorial;

public class Class2 {
	public String dummyString; // you can only see these if you have created an instance of it
	public void iCanChangedummyString(String dummyString){
		//Class1.dummyString = dummyString;
		// not equivalent to
		this.dummyString = dummyString; // this one is the local dummyString
		// because we are inside Class2 and both Class2 and Class1 has a "dummyString"
	}
	
}
