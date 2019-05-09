package e_oop;

public class OOPtest {

	public static void main(String[] args) {
		//문제1. TV라는 클래스를 생성행 TV이름, 전원상태, 채널, 음량을
		// 변경하는 메서드를 만들어라 (생성시 TV이름 지정)
		
		
		//문제2. TV클래스를 사용해서 두대의 TV를 생성하고, 두대의 채널과 음량상태를 
		// 각각 3번이상씩 변경하라
		
		TV t1 = new TV("삼성");
		t1.on_off();
		t1.channel_num(98);
		t1.channel_down();
		t1.channel_down();
		t1.channelup();
		t1.channelup();
		t1.channelup();
		t1.channelup();
		t1.channelup();
		t1.channelup();
		t1.on_off();

		
	
		
		

	}

}
