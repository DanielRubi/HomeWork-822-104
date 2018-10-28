package classTask_21_10_18;

import java.util.Random;

public class App {

	public static void main(String[] args) {
	
	IFly[] array = new IFly[10];
	for (int i = 0; i < array.length; i++) {
		array[i] = createFly();
		
	}
	
	
	
		
		
	
	}

	public static IFly createFly() {
		
		
		Random Fly = new Random();
		int num = Fly.nextInt(3);
		switch(num){
		
		case 0:
			IFly first = new Bird("Canary",2,"Black");
			first.fly(10);
			first.land();
			return first;
			
		
		case 1:
			IFly second = new AirPlane("Ben","Deltalines","Los Angeles");
			second.fly(300);
			second.land();
			return second;
			
		case 2:
			IFly third = new Kite("Blue",50.0);
			third.fly(20);
			third.land();
			return third;
		
			
		}
		return null;
		
	}



		
	

}
