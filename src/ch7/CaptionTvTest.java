package ch7;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv c = new CaptionTv();
		c.channelUp();
		System.out.println(c.channel);
		c.Caption();
		c.Caption();
		c.displayCaption("d");
		
		
		

	}

}

class Tv{
	boolean power; //전원 상태(on/off)
	int channel; //채널
	{
		power = false;
		channel = 10;
	}
	
	
	void power(){ power=!power;	}
	void channelUp(){ channel++; }
	void channelDown(){ channel--;}
} 

class CaptionTv extends Tv{
	boolean Caption;
	
	void Caption(){
		Caption = !Caption;
	}
	void displayCaption(String text){
		if(Caption){	//캡션 상태가 on(true)일때만 text출력
			System.out.println(text);
		}
	}
	
}