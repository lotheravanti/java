package hacker.rank.java;

public class Day4 {


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
	int maxNumberOfPeopleInCar = 6;
	
	public Day4() {
		
	}
	
	public Day4(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
	}	

	// Getters and Setters
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setMaxSpeed(int newMaxSpeed) {
		this.maxSpeed = newMaxSpeed;
	}
	
	public int getMinSpeed() {
		return this.minSpeed;
	}
	
	public double getWeight() {
		return this.getWeight();
	}
	
	public boolean isTheCarOn() {
		return this.isTheCarOn;
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
	
	public void upgradeMaxSpeed() {
		setMaxSpeed(getMaxSpeed() + 10);
	}
	
	public void getIn() {
		if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
			numberOfPeopleInCar++;
			System.out.println("Someone got in");
		} else {
			System.out.println("The car is full " + numberOfPeopleInCar + " out of " + maxNumberOfPeopleInCar);
		}
	}
	
	public void getOut() {
		if (numberOfPeopleInCar > 0) {
			numberOfPeopleInCar--;		
		} else {
			System.out.println("No one is in the car " + numberOfPeopleInCar);
		}
	}
	
	public double howManyMilesTillOutOfGas() {			
		return currentFuel * mpg;
	}
	
	public double maxMilesPerFillUp() {
		return maxFuel * mpg;
	}
	
	public void turnTheCarOn() {
		//if (isTheCarOn == false) {
		// If the car isn't on
		if (!isTheCarOn) {
			isTheCarOn = true;
		} else {
			System.out.println("The Car is already on " + isTheCarOn);
		}
	}
	
	
	public static void main(String[] args) {
			
		Day4 tommyCar = new Day4();
		tommyCar.getOut();
		tommyCar.getOut();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.turnTheCarOn();
		tommyCar.turnTheCarOn();
	}
}
