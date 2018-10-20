package Class_10_10_2018;

public class Program {

	public static void main(String[] args) {
	
		int sumToppings;
		
		// ----new objects
		Pizza p1 = new Pizza(10,4,2);
		p1.isBasicPizza(p1.isBasicPizza());
		p1.statusPizza();
		p1.space();
		
		Pizza p2 = new Pizza(50,8,4);
		p2.isBasicPizza(p2.isBasicPizza());
		p2.statusPizza();
		p2.space();
		
		Pizza p3 = new Pizza(30,4,0);
		p3.isBasicPizza(p3.isBasicPizza());
		p3.statusPizza();
		p3.space();
		
		Pizza p4 = new Pizza(50,8,0);
		p4.isBasicPizza(p4.isBasicPizza());
		p4.statusPizza();
		p4.space();
		
		Pizza p5 = new Pizza(10,4,2);
		p5.isBasicPizza(p5.isBasicPizza());
		p5.statusPizza();
		p5.space();
	
		sumToppings = p1.getToppings()+p2.getToppings()+p3.getToppings()+p4.getToppings()+p5.getToppings();
		System.out.println("The sum of all toppings is: "+sumToppings);
	

	}

}
