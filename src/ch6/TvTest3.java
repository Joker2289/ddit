package ch6;

public class TvTest3 {

	public static void main(String[] args) {
		
		TV t1 = new TV();	// TV t1; - t1 = new TV(); 를 한문장으로 
		TV t2 = new TV();
		
		System.out.println("t1의 channel1값은 " + t1.channel + " 입니다");
		System.out.println("t2의 channel2값은 " + t2.channel + " 입니다");
		
		t2 = t1;	// t1이 저장하고 있는 값(주소)를 t2에 저장
		t1.channel = 7;	//channel 값을 7로 한다.
		System.out.println("t1의 channel 값을 7로 변경하였습니다");
		
		System.out.println("t1의 channel1값은 " + t1.channel + " 입니다");
		System.out.println("t1의 channel2값은 " + t2.channel + " 입니다");
		
		// for문을 이용해 저장 - 다뤄야할 객체가 많을 때 
		TV[] tvArr = new TV[100];
		
		for(int i=0; i < tvArr.length; i++){
			tvArr[i] = new TV();
		}
		
	}

}
