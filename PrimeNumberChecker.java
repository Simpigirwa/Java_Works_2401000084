package Com.Java.Works;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		
CheckPrime();
	}
private static void CheckPrime() {
	Scanner obtainedValue = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int nbr = obtainedValue.nextInt();

	String smString="";
	if(nbr<2) {
		System.out.println("Please enter the number from 2 and above");
	}
	else if(nbr==2) {
		System.out.println(nbr+" is a prime number");
	}
	else {
			
	for(int i=2;i<nbr;i++) {
		if (nbr%i==0) {
			smString=nbr+" is not a prime number";
		}
	}
	if(smString.isEmpty()) {
		smString=nbr+" is a prime number";		
	}
}
	System.out.println(smString);
}
}
