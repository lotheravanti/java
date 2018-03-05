package hacker.rank.java;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Day10Catalogue {

	// Properties/Fields/Global Variables
	Map<String,Day10Book> bookCollection = new HashMap<String,Day10Book>();
	int currentDay = 0;
	int lengthOfCheckoutPeriod = 7;
	double initialLateFee = 0.50;
	double feePerLateDay = 1.00;
		
	// Constructors
	public Day10Catalogue(Map<String,Day10Book> collection) {
		this.bookCollection = collection;
	}
	
	public Day10Catalogue(Map<String,Day10Book> collection, int lengthOfCheckoutPeriod, 
			double initialLateFee, double feePerLateDay) {
		this.bookCollection = collection;
		this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
		this.initialLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
	}
	
	// Getters
	public int getCurrentDay() {
		return this.currentDay;
	}
	
	public Map<String,Day10Book> getBookCollection() {
		return this.bookCollection;
	}
	
	public Day10Book getBook(String bookTitle) {
		return getBookCollection().get(bookTitle);
	}
	
	public int getlengthOfCheckoutPeriod() {
		return this.lengthOfCheckoutPeriod;
	}
	
	public double getInitialLateFee() {
		return this.initialLateFee;
	}
	
	public double getFeePerlateDay() {
		return this.feePerLateDay;
	}
	
	// Setters
	public void nextDay() {
		currentDay++;
	}
	
	public void setDay(int day) {
		currentDay = day;
	}
	
	//Instance Methods
	public void checkOutBook(String title) {
		Day10Book book = getBook(title);
		if (book.getIsCheckedOut()) {
			sorryBookAlreadyCheckedOut(book);
		} else {
			book.setIsCheckedOut(true, currentDay);
			System.out.println("You just checked out " + title + ". It is due on day " +
			(getCurrentDay() + getlengthOfCheckoutPeriod()) + "." );
		}
	}
	
	public void returnBook(String title) {
		Day10Book book = getBook(title);
		int daysLate = currentDay - (book.getDayCheckedOut() + getlengthOfCheckoutPeriod());
		if (daysLate > 0) {
			System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerlateDay()) + 
					" because your book is " + daysLate + " days overdue");
		} else {
			System.out.println("Book Returned. Thank you");
		}
		book.setIsCheckedOut(false, -1);
	}
	
	public void sorryBookAlreadyCheckedOut(Day10Book book) {
		System.out.println("Sorry, " + book.getTitle() + " is already checked out."
				+ "It should be back on day " + (book.getDayCheckedOut() + 
						getlengthOfCheckoutPeriod()) + ".");
	}
	
	
	public static void main(String[] args) {
		Map<String,Day10Book> bookCollection = new HashMap<String,Day10Book>();
		Day10Book harry = new Day10Book("Harry Potter", 827132, 999999);
		bookCollection.put("Harry Potter", harry);
		Day10Catalogue lib = new Day10Catalogue(bookCollection);
		lib.checkOutBook("Harry Potter");
		lib.nextDay();
		lib.nextDay();
		lib.checkOutBook("Harry Potter");
		lib.setDay(17);
		lib.returnBook("Harry Potter");
		lib.checkOutBook("Harry Potter");
	}
}
