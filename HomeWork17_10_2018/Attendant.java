package Home17_10_2018;

public class Attendant extends People {

	private int yearsExperience;
	private String countryOrigin;
	private String function;
	
	// constructor
	
	public Attendant(String name, String lastName, int yearsExperience, String countryOrigin, String function) {
		super(name, lastName);
		this.yearsExperience = yearsExperience;
		this.countryOrigin = countryOrigin;
		this.function = function;
	}
	
public void dataOfClass() {
		
		System.out.println("Attendant\nname = " + name +", lastName = " + lastName +
		", yearsExperience = " + yearsExperience + "\ncountryOrigin = " + countryOrigin +
		", function = " +  function  + ""); 	
	
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

public String getFunction() {
	return function;
}

public void setFunction(String function) {
	this.function = function;
}
	
	 
}
