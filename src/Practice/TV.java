package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class TV {

	int channel = 10;
	int num;
	
	void TV_State(){
		
		System.out.println("현재 채널은" + channel);
	}
	
	void ch_up(){
		channel++;
	}
	
	void ch_down(){
		channel--;
	}
	
	
	void channel_num(int ch2){
		
		this.channel = ch2;
		TV_State();
	}
	
	
	
	void channel_num(String ch){
		
		if(ch == "u"){
			ch_up();
		}else if(ch == "d"){
			ch_down();
		}
		
		TV_State();
	}
	
	
	void channel_num(String ch, int ch2){
		
		if(ch == "u"){
			ch_up();
		}else if(ch == "d"){
			ch_down();
		}else
			this.channel = ch2;
		
		TV_State();
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
