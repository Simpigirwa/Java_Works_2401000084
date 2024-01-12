package Com.Java.Works;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your digit:");
		String val=input.next();
		
		for(int i=0;i<val.length();i++) {
			//get character at this index
			char c=val.charAt(i);
			//Update sum after changing this character to integer
			sum+=Integer.parseInt(String.valueOf(c));
		}
		System.out.println("Summation of the digits compose this number is : "+sum);
	}

}
