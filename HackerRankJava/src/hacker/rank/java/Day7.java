package hacker.rank.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day7 {

	public static void printArray(int[] array){
		System.out.print("[");
		for(int i = 0; i < array.length; i++) {
			int item = array[i];
			System.out.print(item);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		
		
	// Declaring, Allocating and Initializing	
	int[] intArray1;
	int[] intArray2 = new int[4];
	int[] intArray3 = {5, 2, 9, 1, 3};
	
	String[] shoppingList = {"banans", "apples", "pears"};
		
	intArray2[0] = 10;
	intArray2[1] = 8;
	intArray2[2] = 5;
	intArray2[3] = 10;
	
	// Print out Arrays
	System.out.println(Arrays.toString(intArray2));
	System.out.println(Arrays.toString(intArray3));
	
	// Custom print our arrays
	printArray(intArray2);
	System.out.println();
	printArray(intArray3);
	
	// Retrieve objects
	System.out.println();
	System.out.println((intArray2[3]));
	
	// Given functions
	Arrays.sort(intArray3);
	printArray(intArray3);
	
	// Special for loop: foreach
	System.out.println("Special For Loop:");
	for(String s : shoppingList) {
		System.out.println(s);
	}
	
	}
}
