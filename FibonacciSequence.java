package Com.Java.Works;

import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args) {
		/*The Fibonacci series is a series where the next term is the sum of the previous two terms. The first two terms of the Fibonacci sequence are 0 followed by 1.
		Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/
		
		DisplayFibonacciSequence();
	}

	private static void DisplayFibonacciSequence() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter first number:");
		int starting=scanner.nextInt();
		System.out.println("Please enter second number:");
		int next=scanner.nextInt();
		System.out.println("Please enter the limit:");
		int lim=scanner.nextInt();

		System.out.println("Fibonacci Series Up to " + lim + ": ");

		while (starting <= lim) {
			System.out.print(starting + " ");
			// Calculate the next number
			int nextNumber = starting+ next;
			
			// Swap numbers
			starting = next;
			next = nextNumber;
		}

	}
}
