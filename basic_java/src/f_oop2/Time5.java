package f_oop2;

public class Time5 {

	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour; 
	}
	public void setHour(int hour) {
		this.hour = hour % 24;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		setHour(this.hour + minute / 60);
		this.minute = minute % 60;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		setMinute(this.minute + second / 60);
		this.second = second % 60;
	}
	
	@Override
	public String toString() {
		return  hour + "시 " + minute + "분 "+ second + "초";
	}

	
	
	
}
