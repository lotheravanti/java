package hacker.rank.java;

public class Day1 {

	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079;
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";
	
	public void printVariables() {
		
		System.out.println("This is the maxSpeed " + maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
		System.out.println(nameOfCar);
	}
	
	public void wreckCar() {
		condition = 'C';
	}
	
	public void upgradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed +1;
	}
	
	public static void main(String[] args) {
	
		Day1 familyCar = new Day1();
		System.out.println("Family's Car");
		familyCar.printVariables();
		Day1 aliceCar = familyCar;
		familyCar.wreckCar();
		familyCar.upgradeMinSpeed();
		System.out.println("Alice's Car");
		aliceCar.printVariables();
	}
}
