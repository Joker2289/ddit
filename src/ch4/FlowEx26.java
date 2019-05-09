package ch4;

public class FlowEx26 {

	public static void main(String[] args) {
		
		//while문
		
		int i = 0, sum = 0;
		
		while((sum += ++i) <= 100){	// i를 1씩 증가시켜 sum에 더한다
			System.out.printf("%d > %d%n", i, sum);
		}

	}

}
