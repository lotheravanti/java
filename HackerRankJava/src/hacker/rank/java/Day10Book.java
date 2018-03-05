package hacker.rank.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Day10Book {

	// Properties, fields, Global Variables
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut; // whether or not the book is checked out
	int dayCheckedOut = -1;	
	
	// Constructor
	public Day10Book(String bookTitle, int bookPageCount, int bookISBN) {
		this.title = bookTitle;
		this.pageCount = bookPageCount;
		this.ISBN = bookISBN;
		isCheckedOut = false;		
	}
	
	// Getters --> Instance Methods	
	public String getTitle() {
		return this.title;
	}
	
	public int getPageCount() {
		return this.pageCount;
	}
	
	public int getISBN() {
		return this.ISBN;
	}
	
	public boolean getIsCheckedOut() {
		return this.isCheckedOut;
	}
	
	public int getDayCheckedOut() {
		return this.dayCheckedOut;
	}
			
	// Setters
	public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
		this.isCheckedOut = newIsCheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
	}
	
	private void setDayCheckedOut(int day) {
		this.dayCheckedOut = day;		
	}	
	
}
