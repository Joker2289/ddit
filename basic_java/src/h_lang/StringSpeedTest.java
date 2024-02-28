package h_lang;

public class StringSpeedTest {

	public static void main(String[] args) {
		//String 은 내부적으로 선언하기 때문에 한번정해지면 길이를 변경할 수 없고
		//String에 String을 더할때는 속도가 느려짐
		
		String str = "a";
		
		long start = System.currentTimeMillis();	// 현재시간을 밀리세컨까지 측정
		for(int i = 0; i < 200000; i++){
			str +="a";
		}
		long end = System.currentTimeMillis(); // 14000ms = 14초
		System.out.println(end - start + "ms");
		
		
		//String 단점을 보완한 메서드
		StringBuffer sb = new StringBuffer("a");
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++){
			sb.append("a");
		}	
		long end2 = System.currentTimeMillis();	//16ms
		System.out.println(end2 - start2 + "ms");
	}

}
