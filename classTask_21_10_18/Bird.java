package classTask_21_10_18;

import java.util.Scanner;

public class Bird implements IFly {
	
	private String typeOfBird;
	private int age;
	private String color;

	
	// constructor
	
	public Bird(String typeOfBird, int age, String color) {
		this.typeOfBird = typeOfBird;
		this.age = age;
		this.color = color;
	
	// getters and setters
	
	}
	public String getTypeOfBird() {
		return typeOfBird;
	}
	public void setTypeOfBird(String typeOfBird) {
		this.typeOfBird = typeOfBird;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void fly(int speed) {
		System.out.println(" The bird " + this.getTypeOfBird() + " is flying at a speed of " + speed + "miles.");
		
	}
	@Override
	public boolean land() {
		
		boolean land = true;
		Scanner input = new Scanner(System.in);
		System.out.print("please inform (true or false) if the bird is still in the air:");
		land = input.nextBoolean();
		if(land) {
			System.out.println("the bird is in the ground" );
		}else {
			System.out.println("the bird is in the air");
		}
		
		return land;
		
	}
	
	
	

}
