package ch5;

public class ArrayEx8 {

	public static void main(String[] args) {
		
		//섞기 2
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++){
			ball[i] = i;
		}
		
		int temp = 0;
		int j = 0;
		
		
		for(int i = 0; i < ball.length; i++){
			j = (int)(Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		for(int i = 0; i < ball.length; i++){
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
		}
	
	}

}
