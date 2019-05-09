package f_oop2;

public class Time4 {

	private int hour;
	private int minute;
	private int second;
	int tmp;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		tmp = this.hour + hour;
		this.hour = tmp % 24;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.tmp = this.minute + minute;
		this.minute = tmp % 60;
		setHour(tmp/60);
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.tmp = this.second + second;
		this.second = tmp % 60;
		setMinute(tmp/60);
	}
	
	@Override
	public String toString() {
		return hour + "시 " + minute + "분 "
				+ second + "초 " ;
	}
}
