package javatutorial;

public class JavaDemo {

	public static void main(String[] args) {
		// Let the inheritance begin
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		c1.setTheValueOflocalVariable("Jason");
		System.out.println(c1.getTheValueOflocalVariable());
		// JavaDemo can also change the dummy string 2 ways

		System.out.println("setting dummyString to Greg");
		c1.dummyString = "Greg"; // changes the dummy string in the c1 instance of Class1

		System.out.println("setting dummyString to Not Greg");
		Class1.dummyString = "Not Greg"; // changes the dummy string of the static Class1
										// but since dummyString is static, it doesn't matter
										// because there is only one dummyString
		System.out.println(c1.dummyString);
		System.out.println(Class1.dummyString);
		// let's make another Class 1
		Class1 c1v2 = new Class1();
		c1v2.setTheValueOflocalVariable("Jason v2");
		System.out.println(c1.getTheValueOflocalVariable());
		System.out.println(c1v2.getTheValueOflocalVariable());
		// because dummyString is still static, c1v2 will have the same dummyString
		// as c1 or Class1
		System.out.println(c1v2.dummyString);
		System.out.println(c1.dummyString);
		System.out.println(Class1.dummyString);
		// another Demo
		System.out.println("setting dummyString to Greg");
		c1v2.dummyString = "Greg";
		System.out.println(c1v2.dummyString);
		System.out.println(c1.dummyString);
		System.out.println(Class1.dummyString);
		// Here is a different dummyString
		c2.iCanChangedummyString("Hello");
		//Class2.iCanChangedummyString("World"); // doesnt work because the function isnt static
		System.out.println("c2's dummy sting is:");
		//System.out.println(Class2.dummyString); // doesnt work because it isnt static
		System.out.println(c2.dummyString);
		// inharitance ?
		Class2 c2v1 = new Class2();
		System.out.println("c2v1's dummy string is:");
		System.out.println(c2v1.dummyString); // not declared yet
		c2v1.iCanChangedummyString("World");

		System.out.println("c2v1's dummy string is (for real this time):");
		System.out.println(c2v1.dummyString); // not declared yet
		
		
		
	}
	private void iCanChangedummyString(String dummyString){
		Class1.dummyString = dummyString;
		// not equivalent to
		//this.dummyString = dummyString; // This returns an error
		// because we are inside JavaDemo any JavaDemo doesn't have a dummyString
		// only Class2 and Class1 has a "dummyString"
	}

}
