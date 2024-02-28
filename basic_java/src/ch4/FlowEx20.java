package ch4;

public class FlowEx20 {

	public static void main(String[] args) {
		
		//중첩 for문 
		
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 5; j++){
				System.out.printf("[%d, %d]", i, j); 
			}
			System.out.println();
		}
		

	}

}
