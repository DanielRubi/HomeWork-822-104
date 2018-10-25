package Home17_10_2018;

public class Pilot extends People {
	
	private int licenceNumberPilot;
	private int yearsExperience;
	
	//constructor
	
	public Pilot(String name, String lastName, int licenceNumberPilot, int yearsExperience) {
		super(name, lastName);
		this.licenceNumberPilot = licenceNumberPilot;
		this.yearsExperience = yearsExperience;
	}

	public void dataOfClass() {
		
		System.out.println("Pilot\nname = " + name +", lastName = " + lastName + ""
		+ "\nlicenceNumberPilot = " + licenceNumberPilot + " ,"
		+ " yearsExperience = " + yearsExperience + ""); 	
	
	}

	public int getLicenceNumberPilot() {
		return licenceNumberPilot;
	}

	public void setLicenceNumberPilot(int licenceNumberPilot) {
		this.licenceNumberPilot = licenceNumberPilot;
	}

	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}
	
	
	
	
	

}
