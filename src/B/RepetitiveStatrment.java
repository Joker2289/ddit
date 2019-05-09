package B;

import java.util.Scanner;

public class RepetitiveStatrment {

	public static void main(String[] args) {
		/*
		 * 1. 반복문
		 * - for, while, do-while
		 * - 규칙적으로 반복되는 작업을 할때 사용한다.
		 * - 조건식이 만족하는 동안 계속 반복된다.
		 * 
		 * 2. for문 
		 * - 반복횟수를 알 수 있을때 사용한다.
		 * - 조건식이 세부분으로 나뉘어 있다.(초기화; 조건식; 증감식;)
		 * - 1. 변수를 초기화 한다.
		 * - 2. 조건식을 주행해서 값을 얻는다.
		 * - 3. 조건식의 값이 true이면 {}블럭안의 문장을 수행한다.
		 * - 4. 증감식을 수행한다.
		 * - 5. 조건식을 수행해서 값을 얻는다.
		 * - 6. 조건식의 값이 false이면 for문을 벗어난다.
		 * 
		 * 3. while문
		 * - 반복횟수를 알 수 없을 때 사용한다.
		 * - 조건식이 있어야 한다.
		 * - 조건식의 값이 true이면 {}안의 문장을 수행하고 false이면 while문을 벗어난다.
		 * 
		 * 4. do-while문
		 * - while문의 변형이다.(while문과 동일한 특징을 가진다.)
		 * - while문과는 조건식과 {}의 순서가 다르다.
		 * - 최소 1번의 수행이 보장된다.
		 * 
		 * 5. break와 continue
		 * - 반복문 안에서 특정조건에 반복문을 탈출하기 위해 사용한다.
		 * - 자신이 속한 가장 가까운 반복문 하나만 탈출한다.
		 * - break는 반복문을 완전히 탈충한다.
		 * - continue는 현재 수행하고 있는 반복회차만 탈출한다. 
		 */
		
		for(int i = 0; i < 10; i++){	// 1 2 3 4 5 6 7 8 9
			System.out.println(i);
		}
		
		int total = 0;	// 5050 1부터 100까지의 수를 더한 값을 출력
		for(int i = 1; i <= 100; i++){
//			total = total +i;
			total += i;	// 위에 줄여서 쓴거
		}
		System.out.println(total);
		
		for(int i = 100; i >= 1; i--){
			total -=i;
		}
		System.out.println(total);
		
	
		for(int j = 1; j < 10; j++){
			System.out.println("2 * " + j +  " = " + 2 * j );
		}
		
		
		
		//문제1. 0부터 99까지 1씩 증가하는 반복문을 만들어주세요
				/*for(int i = 0; i <=99; i++){
					
				}*/
				
				//문제2. 1부터 50까지 3씩 증가하는 반복문을 만들어주세요
				/*for(int i = 1; i <=50; i += 3){		//	a = a + 3 
					
				}*/
				
				//문제3. 100부터 1까지 1씩 감소하는 반복문을 만들어주세요
				/*for(int i = 100; i >= 1; i--){
					
				}
				
				for(int i = 2; i < 10; i++){
					for(int j = 1; j < 10; j++){
						System.out.printf("%d * %d = %d%n", i, j, i*j);
					}
				}*/
				
				//문제4. 1부터 1024까지 2배씩 증가하는 반복문을 만들어주세요
				/*for(int i = 1; i <= 1024; i *= 2 ){
					
				}*/
				
				//문제5. 1부터 100까지 짝수의 합을 출력해주세요
				/*int j = 0;
				
				for(int i = 0; i <= 100; i += 2){
					 j += i;
				}
				System.out.println(j);*/			// 2씩 증가하면서 더하는 방법
				
				/*for(int i = 1; i <= 100; i++){
					if(i % 2 == 0){
						j += i;
					}
				}
				System.out.println(j);*/			//  i는 1씩 증가하되 증가되는 수중 짝수를 더하는 방식
				
				//문제6.1부터 100까지 3의 배수의 합을 출력하세요
				
				int sum = 0;	
				
				for(int i = 1; i <=100; i++){
					if( i % 3 == 0){
						sum += i;
					}
				}
				System.out.println(sum);
				
				for(int i = 0; i <= 100; i += 3){
					sum += i;
				}
				System.out.println(sum);
				
				//문제7. 구구단 3단을 출력하세요
				
				/*for(int i = 1; i < 10 ; i++){
					System.out.printf("3 * %d = %d%n", i, i*3);
				}*/
				
				
				/*for(int i = 1; i < 10; i++){
					for(int h = 1; h < i; h++){
						System.out.print("*");
					}
						System.out.println();
				}*/
				
				//문제8. 구구단 전체를 출력하세요
				
				/*for(int i = 2; i < 10; i++){
					for(int h = 1; h < 10; h++){
						System.out.printf("%d * %d = %d%n", i, h, i*h);
					}
				}*/
				
				//문제9. 역삼각형 모양의 별을 출력해주세요
				/*for(int i = 5; i > 0; i--){
					for(int k = 0; k < i ; k++){
						System.out.print("*");
					}
					System.out.println();
				}*/
				
				
				//while 반복횟수가 정헤지지 않았을 때
				
				/*int a = 0;
				while(a < 10){
					System.out.println(a);
					a++;	// 증감식 탈출방법
				}*/
				
				/*int num;
				int sum2 = 0;
				boolean flag = true;
				
				System.out.println("합계를 구할 수를 입력하세요 (종료키 0)");
				
				while(flag){
					System.out.print(">>");
					
					Scanner scanner = new Scanner(System.in);
					String tmp = scanner.nextLine();	// 입력된 문자열을 tmp에 저장 //삭제
					num = Integer.parseInt(tmp);		// tmp에 저장된 문자열을 정수로 바까 num에 저장 
					num = scanner.nextInt(); 			//이렇게 바까도됨
					
					if(num != 0){
						sum2 += num;
					}else{
						flag = false;
					}
				}
				System.out.println("합계 =" + sum2);*/
				
				// do - while문
				
				/*int a = 0;
				do{
					System.out.println(a);
					a++;
				}while(a < 20);*/	// while문은 거짓이면 한번도 실행이 안되지만 do-while문은 거짓이라도 한번은 꼭 실행됨
				
				
				
				/*int input = 0, answer = 0;
				
				answer = (int)(Math.random() * 100) + 1;
				Scanner scanner = new Scanner(System.in);
				
				do{
					System.out.print("1~100 까지의 정수를 입력 하세요 >> ");
					input = scanner.nextInt();
					
					if(input > answer){
						System.out.println("더 작은 수를 입력하세요");
					}else if(input < answer){
						System.out.println("더 큰 수를 입력하세요");
					}
				}while(input != answer);
					
			
				System.out.println("정답");*/
				
				
				
				
/*				outer :	// 이름을 지정해줌 
				for(int i = 2; i <= 9; i++){
					for(int j2 = 1; j2 <= 9; j2++){
						if(j2 == 5){
//						    break outer;	// outer라는 for문을 벋어나겠다(바깥의 for문까지 완전히 벗어남)
//						    break;
//							continue outer;
//							continue;		//해당 회차를 멈추고 그다음 회차를 실행 5를 멈추고 6부터 실행
						}
						System.out.println(i + " * " + j2 + " = " + i * j2);
					}
					System.out.println();
				}*/
		
		
		
		
		
		
		
	}

}
