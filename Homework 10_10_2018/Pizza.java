package Class_10_10_2018;

public class Pizza {

	private int diameter, slices, toppings;
	private boolean basicPizza;


	// ---CONSTRUCTOR--

	public Pizza(int diameter, int slices, int toppings) {
		super();
		this.diameter = diameter;
		this.slices = slices;
		this.toppings = toppings;
	
	}
	// ---GETTER AND SETTER---

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		this.toppings = toppings;
	}
	
	public boolean isBasicPizza() {
		return basicPizza;
	}

	public void setBasicPizza(boolean basicPizza) {
		this.basicPizza = basicPizza;
	}

	// Special functions

	public boolean isBasicPizza(boolean basicPizza) {
		if (getToppings() == 0) {
			basicPizza = true;
			System.out.println("It's a basic pizza");
		} else {
			basicPizza = false;
			System.out.println("It's not a basic pizza");
		}

		return basicPizza;
	}
	
	public void space() {
		System.out.println("---------------");
	}


	

	public void statusPizza() {
		System.out.println("----STATUS PIZZA----");
		System.out.println("The size of the pizza is: " + getDiameter() + ".");
		System.out.println("the pizza has: " + getSlices() + " slices.");
		System.out.println("there is " + getToppings()+  " toppings on the pizza.");
		
	}
}
