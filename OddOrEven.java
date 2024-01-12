package Com.Java.Works;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		Scanner obtainedValue = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int nbr = obtainedValue.nextInt();

		if(nbr % 2 == 0)
			System.out.println("You entered "+nbr + " which is even number");
		else
			System.out.println("You entered "+nbr + " which is odd number");
	}

}
