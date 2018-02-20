package hacker.rank.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {   

	static int n = 2;
	double mealCost = 14;
	double tipPercent = 20;
	double taxPercent = 8;
	
    double tip = mealCost * tipPercent / 100;
    double tax = mealCost * taxPercent / 100;
    double total = mealCost + tip + tax;
    int totalCost = (int) Math.round(total);
    
    public static void multiply() {
        
    }
    }


    
    public Test() {
    	
    }
	
    public static void main(String[] args) {    

        Test food = new Test();
        System.out.println(food.totalCost);
        multiply();

    }
}