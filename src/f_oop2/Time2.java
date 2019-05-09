package f_oop2;

public class Time2 {

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
		if(minute>59){
			this.minute = minute % 60;
			this.hour = minute / 60;
		}
		this.setHour(hour);
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second>59){
			this.second = second % 60;
			this.minute = second / 60;
		}
		this.setMinute(minute);
	}
	
	@Override
	public String toString() {
		return hour + ":" +  minute + ":" + second;
	}
}
