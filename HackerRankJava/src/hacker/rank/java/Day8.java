package hacker.rank.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Day8 {

	
	
	
	public static void main(String[] args) {
			
		// English to Spanish Dictionary
		Map <String, String> englSpanDictionary = new HashMap <String,String>();
		
		// Putting things in dictionary
		englSpanDictionary.put("Monday","Lunes");
		englSpanDictionary.put("Tuesday","Martes");
		englSpanDictionary.put("Wednesday","Miercoles");
		englSpanDictionary.put("Thursday","Jueves");
		englSpanDictionary.put("Friday","Viernes");
		englSpanDictionary.put("Saturday","Sabado");
		englSpanDictionary.put("Sunday","Domingo");
		
		// Retrieve things from dictionary
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));
		System.out.println(englSpanDictionary.get("Wednesday"));
		
		// Print out all keys
		System.out.println(englSpanDictionary.keySet());
		
		// Print out all values
		System.out.println(englSpanDictionary.values());
		
		// Print out all size
		System.out.println("The size of the dictionary is " + englSpanDictionary.size());
		
		System.out.println();
		System.out.println();
		
		// Shopping List
		
		Map <String, Boolean> shoppingList = new HashMap <String, Boolean>();
		
		// Put some stuff in list		
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE );
		shoppingList.put("Eggs", Boolean.FALSE );
		shoppingList.put("Sugar", false);
		
		// Retrieve items
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Oreos"));
		System.out.println(shoppingList.get("Eggs"));
		System.out.println(shoppingList.get("Sugar"));
		
		// Is it empty?
		System.out.println(shoppingList.isEmpty());
		
		// Remove item
		shoppingList.remove("Eggs");
		
		// Replace value
		shoppingList.replace("Bread", Boolean.FALSE);
		
		// Print out Key-Value pairs
		System.out.println(shoppingList.toString());
		
		// Clear out list
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		// Is it empty?
		System.out.println(shoppingList.isEmpty());
		
	}
}
