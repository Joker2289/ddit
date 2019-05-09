package ch6;

public class TvTest2 {

	public static void main(String[] args) {
		
		TV t1 = new TV();	// TV t1; - t1 = new TV(); 를 한문장으로 
		TV t2 = new TV();
		
		System.out.println("t1의 channel1값은 " + t1.channel + " 입니다");
		System.out.println("t2의 channel2값은 " + t2.channel + " 입니다");
		
		t1.channel = 7;	//channel 값을 7로 한다.
		System.out.println("t1의 channel 값을 7로 변경하였습니다");
		
		System.out.println("t1의 channel1값은 " + t1.channel + " 입니다");
		System.out.println("t1의 channel2값은 " + t2.channel + " 입니다");
		
	}

}
