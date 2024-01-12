package Com.Java.Works;

import java.util.Scanner;

public class ArrayManipulation {
	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);

	        // Get the size of the array from the user
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Declare and initialize the array based on user input
	        int[] firstArr = new int[size];

	        // Get values for each element of the array from the user
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            firstArr[i] = scanner.nextInt();
	        } 
		 
	        // Double each element in the array
	        int[] doubledArray = doubleElementsOfArray(firstArr);

	        // Print the original array
	        System.out.println("Original Array:");
	        printArray(firstArr);

	        // Print the modified (doubled) array
	        System.out.println("\nDoubled Array:");
	        printArray(doubledArray);
	    }

	    // Method to double each element in the array
	    private static int[] doubleElementsOfArray(int[] array) {
	        int[] result = new int[array.length];

	        for (int i = 0; i < array.length; i++) {
	            result[i] = array[i] * 2;
	        }

	        return result;
	    }

	    // Method to print an array
	    private static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println(); // Move to the next line after printing the array
	    }
	}