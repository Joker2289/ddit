package ch5;

import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		
		//임의의 값으로 배열 채우기
		int[] code = {-4, -2, -5, 6, 0, 9, 8};
		int[] arr = new int[12];
		
		for(int i = 0; i < arr.length; i++){
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
