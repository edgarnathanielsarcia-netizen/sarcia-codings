package Fibonnaci;
import java.util.Scanner;

public class FibonacciRecursion{
	
// METHOD
	public static long fibonacci(int n){
		// base case
		if(n == 0) return n; // returns 0 if index is 0
		if(n == 1) return n; // returns 1 if index is 1
		// recursive method
		return fibonacci(n - 1) + fibonacci(n - 2); // adding two previous numbers to get the next number
}
// MAIN METHOD
	public static void main (String [] args){
	   	Scanner sc = new Scanner(System.in);
		// Asks the user for number of terms
		System.out.println("Number of terms: ");

try { // INPUT VALIDATION
		if (!sc.hasNextInt()){  // checks for non-integer inputs
			System.out.println("[ERROR]: Enter integers only."); // displays an error message
			return;
		} 
			int num = sc.nextInt();
		if (num < 0){ // checks for negative numbers
			System.err.println("[ERROR]: Please enter a positive integer."); // displays an error message
			return;
		}
		// iterates every index (positon) to display
		for(int i = 0; i <= num; i++){
			System.out.print(fibonacci(i) + " ");
		}
	} catch (IllegalArgumentException e){ // catches the exception
		System.err.println("ERROR: Enter integers only"); // displays an error message
																
	} 
  }
}



