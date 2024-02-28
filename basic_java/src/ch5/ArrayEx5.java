package ch5;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		//총합과 평균
		int sum = 0;
		float average = 0.0f;
		
		int[] score = {75, 87, 96, 100, 51, 100};
		
		for(int i = 0; i < score.length; i++){
			sum += score[i];
		}
		
		average = sum / (float)score.length;
				
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + average);
		
	}

}
