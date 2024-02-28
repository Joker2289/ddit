package f_oop2;

public class Time {
	// alt + shift + s
	// private 한 변수에 접근하기위해선 메서드를 getter setter이용해야함
	// toString
	private int hour;
	private int minute;
	private int second;
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second > 59){
			this.second = second % 60; 
			this.minute = second / 60 % 60;
			this.hour = second / 60 /60 % 24;
		}else if(second < 60 ) {
			this.second = second;
		}
	}
	
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

}


