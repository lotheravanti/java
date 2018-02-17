package hacker.rank.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {   

	double mealCost = 12;
	double tipPercent = 20;
	double taxPercent = 8;
	
    double tip = mealCost * tipPercent / 100;
    double tax = mealCost * taxPercent / 100;
    double total = mealCost + tip + tax;
    int totalCost = (int) Math.round(total);
    
    public Test() {
    	
    }
	
    public static void main(String[] args) {    

        Test food = new Test();
        System.out.println(food.totalCost);


    }
}