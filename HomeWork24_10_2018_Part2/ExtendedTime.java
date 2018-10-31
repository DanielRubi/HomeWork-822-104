package HomeWork24_10_2018_Part2;

public class ExtendedTime extends SimpleTime {

	private boolean is24Hours;

//---------------------CONSTRUCTOR---------------------------------------------	
	public ExtendedTime(int hour, int minute, int second, boolean is24Hours ) {
		super((is24Hours == true)?hour:hour%12, minute, second);
		this.is24Hours = is24Hours;
	}

	
	public ExtendedTime() {
		super(0,0,0);
		this.is24Hours = true;
	}

	//------------------getters and setters-------------------------------------
	
	public boolean isIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}

	
	@Override
	public String toString() {
	if(is24Hours) {	
	return hour + ":" + minute + ":" + second;
	}else {
		
		return hour%12 + ":" + minute + ":" + second;
		
	}
	
	
	
	
	}
	
	
	
	
	
	
	
}
