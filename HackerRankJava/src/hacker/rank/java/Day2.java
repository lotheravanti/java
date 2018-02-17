package hacker.rank.java;

public class Day2 {

	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079;
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";
	
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg = 26.4;
	
	int numberOfPeopleInCar = 1;
	
	public Day2(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
	}
		
	public void printVariables() {
		
		System.out.println("This is the maxSpeed " + maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
		System.out.println(nameOfCar);
		System.out.println(numberOfPeopleInCar);
	}
	
	public void wreckCar() {
		condition = 'C';
	}
	
	public void upgradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed +1;
	}
	
	public void getIn() {
		numberOfPeopleInCar++;		
	}
	
	public void getOut() {
		numberOfPeopleInCar--;		
	}
	
	public double howManyMilesTillOutOfGas() {			
		return currentFuel * mpg;
	}
	
	public double maxMilesPerFillUp() {
		return maxFuel * mpg;
	}

	
	
	public static void main(String[] args) {
			
		Day2 birthdayPresent = new Day2(500, 5000.545, true);
		System.out.println("Birthday Car v1");
		birthdayPresent.printVariables();
		birthdayPresent.getIn();
		birthdayPresent.getIn();
		birthdayPresent.getIn();
		System.out.println("Miles left:" + birthdayPresent.howManyMilesTillOutOfGas());
		System.out.println("Max Miles:" + birthdayPresent.maxMilesPerFillUp());
		System.out.println("Birthday Car v2");
		birthdayPresent.printVariables();
		//birthdayPresent.getOut();
		//System.out.println("Birthday Car v3");
		//birthdayPresent.printVariables();
//		System.out.println("Christmas Car");
//		Day2 christmasPresent = new Day2(550, 2000, false);
//		christmasPresent.printVariables();
		
		
		
	}
}
