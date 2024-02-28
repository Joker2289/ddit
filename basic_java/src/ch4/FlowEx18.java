package ch4;

public class FlowEx18 {

	public static void main(String[] args) {
		
		// 중첩 for문 
		
		for(int i = 2; i < 10; i++){
			for(int j = 1; j < 10; j++){
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}

	}

}
