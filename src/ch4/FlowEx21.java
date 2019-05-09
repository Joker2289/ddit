package ch4;

public class FlowEx21 {

	public static void main(String[] args) {
		
		//중첩 for문
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 5; j++){
				if(i == j){
					System.out.printf("[%d, %d]", i, j);
				}else{
					System.out.printf("%6c",' ');	//공백 6칸을 출력
				}
			}
			System.out.println();
		}

	}

}
