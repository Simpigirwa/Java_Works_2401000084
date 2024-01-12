package Com.Java.Works;

import java.util.Iterator;
import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		
		String word="amatama";
		String lowerdWord=word.toLowerCase();
			String mssg="";
			// Palindrome string is a string that may be the same while read from left or right
		for(int i=0,j=lowerdWord.length()-1;i<=j;i++,j--) {
			if (lowerdWord.charAt(i)!=lowerdWord.charAt(j)) {
				mssg="The entered string is not palindrome ";
			}else {
				mssg="The entered string is palindrome ";
			}
		}

		System.out.println(mssg);

	}
}
