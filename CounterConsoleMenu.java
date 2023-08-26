/**
 * @ Nikunj Gupta 
 * This program creates a test method and uses the Counter class methods.
 */

// imports Scanner class for user input
import java.util.Scanner;

public class CounterConsoleMenu {
	
	public static void test() {
		
		// defines variable "again"
		int again;
		
		// creates new scanner to enable user input
		Scanner input = new Scanner(System.in);

		do {
			
			System.out.println("======================================================================");
			System.out.println("Available options: Increment - 0, Decrement - 1, Reset - 2, Quit - 3 ");			
			System.out.println("Counter Value: " + Counter.counter);
			System.out.println("======================================================================");
			
			System.out.print("Enter your value: ");
			again = input.nextInt();
			
			// increments the counter variable
			if (again == 0) {
				Counter.increment();
			}
			
			// decrements the counter variable
			if (again == 1) {
				Counter.decrement();
			}
			
			// resets the counter variable
			if (again == 2) {
				Counter.reset();
			}
			
		// continues the program unles the user wants it to end by entering 3
		} while (again != 3);
		
		System.out.println("Goodbye!");
	

}
}

