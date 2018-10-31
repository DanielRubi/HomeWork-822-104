package HomeWork24_10_2018_Part2;

public class Alarm {
	
	public SimpleTime time;
	private boolean isSet;
	private int snoozeTime;
	private boolean isSnooze;

	//-----------------CONSTRUCTOR----------------------------------------------------
	
	public Alarm() {
		
		this.time.setHour(0);
		this.time.setMinute(0);
		this.time.setSecond(0);
		this.isSet = false;
		this.snoozeTime = 0;
		this.isSnooze = false;
	}


	public Alarm(SimpleTime hour, boolean isSet, int snoozeTime, boolean isSnooze) {
		 
		this.time = hour;
		this.isSet = isSet;
		this.snoozeTime = snoozeTime;
		this.isSnooze = isSnooze;
	}
	
	//-----------------GETTERS AND SETTERS----------------------------------------------


	public SimpleTime getTime() {
		return time;
	}


	public void setTime(SimpleTime time) {
		this.time = time;
	}


	public boolean isSet() {
		return isSet;
	}


	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}


	public int getSnoozeTime() {
		return snoozeTime;
	}


	public void setSnoozeTime(int snoozeTime) {
		this.snoozeTime = snoozeTime;
	}


	public boolean isSnooze() {
		return isSnooze;
	}


	public void setSnooze(boolean isSnooze) {
		this.isSnooze = isSnooze;
	}


	
	
	
	
	
	

	
	
}
