package ch4;

import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {
		
		//while문 
		int num = 0;
		int sum = 0;
		boolean flag = true;
				
		System.out.println("합계를 구할 숫자를 입력하세요 (종료키 0)");
		
		while(flag){
			System.out.printf(">>");
			
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			
			if(num !=0){
				sum += num;
			}else{
				flag = false;
			}
		}
		
		System.out.println("총 합계 = " + sum);

	}

}
