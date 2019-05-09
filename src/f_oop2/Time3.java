package f_oop2;

public class Time3 {
	
	private int hour;
	private int minute;
	private int second;
	
	int time_sum;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.time_sum += hour;
		if(this.time_sum > 24){
			this.hour = this.time_sum % 24;
		}else if(this.time_sum < 24){
			this.hour = this.time_sum;
			return;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.time_sum += minute;
		if(this.time_sum > 59){
			this.minute = this.time_sum % 60;
			this.time_sum = this.time_sum / 60;
		}else if(this.time_sum < 59){
			this.minute = this.time_sum;
			return;
		}
		setHour(this.hour);
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.time_sum += second;
		if(this.time_sum > 59){
			this.second = this.time_sum % 60;
			this.time_sum = this.time_sum / 60;
		}else if(this.time_sum < 59){
			this.second = this.time_sum;
		}
		setMinute(this.minute);
	}
	
	
	@Override
	public String toString() {
		return hour + "시 " + minute + "분 " + second + "초";
	}
	
	

	
}
