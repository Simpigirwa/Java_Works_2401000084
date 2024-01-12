package Com.Java.Works;

import java.util.Scanner;

public class FactorialCalculation {
	public static void main(String[] args) {
		long fact=CalculateFactorial();
		System.out.println("Entered value is "+enteredVal+ " its factorial is "+fact);
	}
	private static int  enteredVal;
	private static long  CalculateFactorial() {

		Scanner userVal=new Scanner(System.in);
		System.out.println("Please enter the value you want to calculate its factorial: ");
		enteredVal=userVal.nextInt();

		long factorial = 1;
		for(int i = 1; i <= enteredVal; ++i)
		{
			// factorial = factorial * i;
			factorial *= i;
		}

		return factorial;

	}
}
