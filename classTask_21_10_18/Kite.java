package classTask_21_10_18;

import java.util.Scanner;

public class Kite implements IFly {

	private String color;
	private double price;
	
	
	// constructor
	
	public Kite(String color, double price) {
		this.color = color;
		this.price = price;
	}
	
	// get and setters
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public void fly(int speed) {
		System.out.println("the Kite of " + this.getColor() + " color is moving at a speed of " + speed);
		
	}

	@Override
	public boolean land() {
		boolean land = true;
		Scanner input = new Scanner(System.in);
		System.out.print("please inform (true or false) if the kite is still in the air:");
		land = input.nextBoolean();
		if(land) {
			System.out.println("the kite is in the ground" );
		}else {
			System.out.println("the kite is in the air");
		}
		
		return land;
		
	}

	
	
}
