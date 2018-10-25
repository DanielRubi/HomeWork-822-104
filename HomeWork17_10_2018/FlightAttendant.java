package Home17_10_2018;

public class FlightAttendant extends People {

	private int yearsExperience;
	private String countryOrigin;
	private String class1;
	
	// constructor
	public FlightAttendant(String name, String lastName, int yearsExperience, String countryOrigin, String class1) {
		super(name, lastName);
		this.yearsExperience = yearsExperience;
		this.countryOrigin = countryOrigin;
		this.class1 = class1;
	}
	
public void dataOfClass() {
		
		System.out.println("Flight Attendant\nname = " + name +", lastName = " + lastName +
		", yearsExperience = " + yearsExperience + "\ncountryOrigin = " + countryOrigin +
		", class = " +  class1  + ""); 	
	
	}

	// getters and setters
	
	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public String getClass1() {
		return class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}
	
	
	
	
	
}
