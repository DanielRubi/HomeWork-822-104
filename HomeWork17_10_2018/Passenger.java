package Home17_10_2018;

public class Passenger extends People {

	private int passPortNum;

	public Passenger(String name, String lastName, int passPortNum) {
		super(name, lastName);
		this.passPortNum = passPortNum;
	}
	
	public void dataOfClass() {
		
		System.out.println("Passenger\nname = " + name +", lastName = " + lastName + 
				"\n passPortNum = " + passPortNum + ""); 	
	
	}
	
}
