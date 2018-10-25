package Home17_10_2018;

public class App {

	public static void main(String[] args) {
		
	Pilot people1 = new Pilot("Joao","Silva",12345,10);
	FlightAttendant people2 = new FlightAttendant("Ben","naites",5,"Unites States","First Class");
	Attendant people3 = new Attendant("Shir","Zen",20,"Brazil","Passenger Service Assistant");
	Passenger people4 = new Passenger("Chen","Shlibo",562541);
	
	people1.dataOfClass();
	System.out.println();
	people2.dataOfClass();
	System.out.println();
	people3.dataOfClass();
	System.out.println();
	people4.dataOfClass();
	

	}

}
