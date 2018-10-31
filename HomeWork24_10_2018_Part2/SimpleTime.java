package HomeWork24_10_2018_Part2;

public class SimpleTime {

	protected int hour;
	protected int minute;
	protected int second;

	//-----------------CONSTRUCTOR-----------------------
	
	public SimpleTime() {
		this(0, 0, 0);
	}

	public SimpleTime(int hour, int minute, int second) {
		this.hour = (hour >=0 && hour <= 23)?hour:0;
		this.minute = (minute >=0 && minute <=59)?minute:0;
		this.second = (second >= 0 && second <=59)?second:0;
	}

	//-----------------getters and setters----------------

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = (hour >=0 && hour <= 23)?hour:0;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = (minute >=0 && minute <=59)?minute:0;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = (second >= 0 && second <=59)?second:0;
	}

	

	//-------------special functions--------------------------

	public void setTime(int hour, int min, int sec) {

		this.hour = (hour >=0 && hour <= 23)?hour:0;
		this.minute = (minute >=0 && minute <=59)?minute:0;
		this.second = (second >= 0 && second <=59)?second:0;

	}

	public void add(SimpleTime aux) {
	this.hour= getHour() + (aux.hour % 24);
	this.minute = getMinute() + (aux.minute % 60);
	this.second = getSecond() + (aux.second % 60);
	}

	public void addHour(int hour) {
		this.setHour(getHour() + (hour % 24));

	}
	
	public void addMinute(int min) {
		this.setMinute(getMinute() + (min % 60));
	}
	
	public void addSecond(int sec) {
		this.setSecond(getSecond() + (sec % 60));
	}
	
	public void tick() {
		this.setSecond(getSecond() + 1);
			
	}
	
	public boolean equal(SimpleTime aux) {
		boolean test = false;
		 if(aux.hour == this.getHour() && aux.minute == this.getMinute() 
				&& aux.second == this.getSecond()) {
			 test = true;
			 System.out.println("the time "+ this.toString()+" is equal to " + aux);
		 }else {
			 System.out.println("it's not equal");
		 }
		 
		 return test;
	}
	
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second ;
	}
	

}
