package classTask_21_10_18;

import java.util.Scanner;

public class AirPlane implements IFly {

	private String pilotName;
	private String companyName;
	private String destination;
	
	
	// constructor
	
	public AirPlane(String pilotName, String companyName, String destination) {
		this.pilotName = pilotName;
		this.companyName = companyName;
		this.destination = destination;
	}
	
	// getters and setters
	
	public String getPilotName() {
		return pilotName;
	}
	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	

	@Override
	public void fly(int speed) {
		System.out.println(this.getPilotName() + " is flying the aircraif of " 
				+ getCompanyName() + " at a speed of: " + speed + " miles");
		
	}
	@Override
	public boolean land() {
		boolean land = true;
		Scanner input = new Scanner(System.in);
		System.out.print("please inform (true or false) if airplane from company " + 
		this.getCompanyName() + " has arrived:");
		land = input.nextBoolean();
		if(land) {
			System.out.println("the landing in " + this.getDestination() +  " was a success" );
		}else {
			System.out.println("aircraft is still flying");
		}
		
		return land;
	}


	
	
}
