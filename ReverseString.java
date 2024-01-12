package Com.Java.Works;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string:");
	String enteredString=scanner.next();
	StringReverse(enteredString);
}
private static void StringReverse(String name) {
	//String name="amatama8";
	String reversed="";
	for(int r=name.length()-1;r>=0;r--) {
		reversed=reversed+name.charAt(r);
	}
	System.out.println("The reverse of the string ("+name +") is : "+reversed);
}
}
