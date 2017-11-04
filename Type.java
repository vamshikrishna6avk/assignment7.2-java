/**
 * This class is doing the implicit type promotion
 *
 */
package implicittype;//created package as implicittype
public class Type {//created class as type

	public static void main(String[] args) {
		//here i take the two different type of variable short and double
	    short s = 1024;
	    double d = .1234;
	    //this will promote the short in double
	    double result = d * s;
	    //here it will print the result
	    System.out.println("d * s is " + result);//prints

	}

}