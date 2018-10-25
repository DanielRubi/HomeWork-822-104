package Home17_10_2018;

public abstract class People {
	
	protected String name;
	protected String lastName;
	// constructor
	public People(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
