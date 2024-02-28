package homework;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
			//숙제1. 숫자를 입력받아 1부터 입력받은 수까지 홀수의 합과 짝수의 합을 구하시오
			
			/*int input; 
			int sum = 0;	//짝수 저장
			int sum1 = 0;	//홀수 저장
			
			System.out.print("숫자를 입력하세요 >> ");
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
			
			for(int i = 0; i <= input; i++){
				if(i%2 == 0){
					sum += i;
				}else if(i%2 == 1){
					sum1 += i; 
				}
			}
			System.out.println("입력한 수까지");
			System.out.println("홀수의 합 > " + sum1);
			System.out.println("짝수의 합 > " + sum);*/
		
			//숙제2. 직각이 오른쪽에 있는 삼각형 모양의 별을 출력해주세요
				
				/*for(int line = 1; line <= 5; line++){
					for(int i = 5; i > line; i--){
						System.out.print(" ");
					}
					for(int star = 1; star <= line; star++){
						System.out.print("*");
					}
					System.out.println();
				}*/
				
				
			//숙제3. 직각이 오른쪽에 있는 역삼각형 모양의 별을 출력해주세요
				
					/*for(int i=1; i<=5; i++){
						for(int j=1; j<i; j++){
							System.out.printf(" ");
						}
						for(int k=5; k>=i; k--){
							System.out.printf("*");
						}
					System.out.println();
					}*/
			
			//숙제4. 이등변 삼각형 모양의 별을 출력해주세요
				
				/*for(int i=1; i<11; i+=2){
					for(int j=11; j>i; j-=2){
						System.out.printf(" ");
					}
					for(int k=1; k<=i; k++){
						System.out.printf("*");
					}
					System.out.println();
				}*/
		
		
				/*for(int i=1; i<6; i++){
					for(int j=5; j>i; j--){
						System.out.printf(" ");
					}
					for(int k=1; k<=i; k++){
						System.out.printf("*");
					}
					for(int k=1; k<=i-1; k++){
						System.out.printf("*");
					}
					System.out.println();
				}*/						//다른방법
		
		
			
			//숙제5. 역 이등변 삼각형 모양의 별을 출력해주세요
				
				/*for(int i=5; i>0; i--){
					for(int j=5; j>i; j--){
						System.out.printf(" ");
					}
					for(int k=1; k<=i; k++){
						System.out.printf("*");
					}
					for(int k=1; k<=i-1; k++){
					System.out.printf("*");
					}
				System.out.println();
				}*/
		
	     		/*int k1 = 0, k2 = 11;
	      
	      		for (int i = 0; i < 6; i++){
	         		for(int j = 0; j <k1; j++){
	            		System.out.print(" ");
	         		}
	         		for(int j = 0; j < k2; j++){
	            		System.out.print("*");
	         		}
	         			k1++;
	         			k2 -= 2;
	         
	         		System.out.println();
	      }*/
		for(int i =10; i > 0; i--){
			for(int j = 0; j < 10 - i; j++){	// 공백은 1개씩 증가
				System.out.print(" ");
			}
			for(int j = 0; j < i * 2 - 1; j++){	// 별은 2개씩 감소 // i에 2를 곱함으로써 2씩 감소 
				System.out.print("*");			// -1은 홀수로 출력하기 위해(마지막 출력 1)
			}
			System.out.println();
		}
		
		
				
				
	}

}
