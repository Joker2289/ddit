package ch4;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
		
		//do-while문
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.print("숫자를 맞혀봐 > ");
			input = scanner.nextInt();
			
			if(input < answer){
				System.out.println("땡!! 더 큰수를 입력해봐 등신아 ^-^");
			}else if(input > answer){
				System.out.println("땡!! 더 작은수를 입력해봐 등신아 ^-^");
			}
		}while(input != answer);
		
		System.out.println("오구오구 맞았어 잘했다 등신아 ^3^");
	}

}
