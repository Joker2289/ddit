package test;

public class Excercise7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		
	}

}

class MyTv2 {
	private	boolean isPowerOn;
	private int channel;
	private int volume;
	int channel2;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;


	public void power(){
		isPowerOn = !isPowerOn;
	}
	
	public int getChannel(){
		return channel;
	}
	
	public void setChannel(int num){
		if(MAX_CHANNEL >= num && MIN_CHANNEL <= num){
			this.channel2 = this.channel;
			this.channel = num;
		}
	}

	public int getVolume(){
		return volume;
	}
	
	public void setVolume(int num){
		if(MAX_VOLUME >= num && MIN_VOLUME <= num)
		this.volume = num;
	}
	
	public void gotoPrevChannel(){
		setChannel(this.channel2);
	}



}