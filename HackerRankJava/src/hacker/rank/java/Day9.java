package hacker.rank.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Day9 {

	public static int Summation(int n) {
	
		// Base Case
		if (n <= 0) {
			return 0; // additive identity property
		} 
		// Recursive Case: Keep going
		else {
			return n + Summation(n-1);
		}
	}
	
	public static int Factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * Factorial(n-1);
		}
	}
	
	public static int Exponentiation(int n, int p) {
		if (p <= 0) {
			return 1;
		} else {
			return n * Exponentiation(n,p-1);
		}
	}
	
	public static void main(String[] args) {
			
		System.out.println(Summation(5));
		System.out.println(Factorial(5));
		System.out.println(Exponentiation(3,2));
	}
}
