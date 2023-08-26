/**
 * @ Nikunj Gupta 
 * This program creates the counter methods for incrementing, decrementing and resetting.
 */

public class Counter {

	// creates static variable counter
	public static int counter = 0;
	
	// method for incrementing the value of counter
	public static void increment() {
		counter++;
	}
	
	// method for decrementing the value of counter
	public static void decrement() {
		counter--;
	}
	
	// method for reseting the value of counter
	public static void reset() {
		counter = 0;
	}
}
