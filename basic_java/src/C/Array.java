package C;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * 1.배열
		 * - 같은 타입의 변수를 하나의 묶음으로 다루는 것
		 * 
		 * 2. 배열의 선언 
		 * - int[] number = new int[5]; // 기본값으로 초기화 된다.
		 * - int[] number = new int[]{10, 20, 30, 40, 50};
		 * - int[] number = {10, 20, 30, 40, 50}; 
		 * 
		 * 3.배열의 사용
		 * - 변수명[인덱스](number[0])
		 * - 인덱스는 0부터 시작
		 * - 배열의 길이는 변수명 . length(number.length)
		 * - 배열의 출력은 Arrays.toString();
		 * - 배열의 정렬은 Arrays.sort();
		 * - 배열의 복사는 System.arraycopy();
		 * - 향상된 for문 for(변수선언 : 배열){} 
		 */
		

		int[] numbers = new int[5];
		int numbers2[] = new int[]{1, 2, 3, 4, 5};
		int[] numbers3 = {1, 2, 3, 4, 5};	// 선언과 동시에 초기화를 할때 만 가능 
		
		System.out.println(Arrays.toString(numbers));
		
		numbers[0] = 1;	// 대괄호안의 숫자는 인덱스 번호 // 배열안의 0번째 자리에 1을 넣겠다
		numbers[1] = 2; 
		numbers[2] = numbers[0] + numbers[1];
		numbers[3] = numbers[2] * 2;
		numbers[4] = numbers[3] > numbers[2] ? numbers[3] : numbers[2];
		
		// for문과 사용 예
		
		for(int i = 0; i < 5; i++){			// i < 5 처럼 직접 배열의 길이를 넣진 않음 -> 하드코딩
			System.out.println(numbers[i]); // 나중에 배열의 길이를 수정 할 수도있어서 
		}
		
		for(int i = 0; i < numbers.length; i++){ // length를 넣어주어 배열의 길이를 반환
			System.out.println(numbers[i]);
		}
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = numbers.length - i;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);			// 배열 정렬
		System.out.println(Arrays.toString(numbers));
		
		int[] copyNumbers = new int[10];// 한번 배열의 길이를 초기화하면 중간에 바꿀 수 없으므로 새로 카피를 해준다
		System.arraycopy(numbers, 0, copyNumbers, 0, 5); // 넘버스의 0번째를 카피넘버스의 0번째에 5개넣겠다
		System.out.println(Arrays.toString(copyNumbers));
		
		for(int number : numbers){		// 향상된 for문 // 배열에 쉽게 접근 하기위해
			System.out.println(number); // 배열 타입  변수  : 배열 // 
		}
		
		for(int number : numbers){	// 향상된 for문에서는 읽기만 가능하고 쓰기는 불가능  
			number = 10; // numbers에 대입되지 않는다.
		}
		
		//예제 5-5
		
		/*int sum = 0;
		float average = 0f;
		
		int[] score = {100, 100, 88 , 99 ,60};
		
		for(int i = 0; i < score.length; i++){	// 인덱스 0,1,2,3,4 - i<score
				sum += score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);*/
		
		//예제 5-6
		
		/*int[] score = {1, 2, 3 ,4 ,5, 6};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++){
			if(score[i] > max){
				max = score[i];
			}
			else if(score[i] < min){
				min = score[i];
			}
		}
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);*/
		
		
		//예제 5-7 - 자리 바꾸기
		
		/*int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++){	// 0~9까지 배열에 저장하는 for문
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < 100; i++){			// 숫자를 섞는 for문 
			int n = (int)(Math.random() * 10);	// *10(0 ~ 9)
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i = 0; i < numArr.length; i++){	// 인덱스 0부터 9까지 순차적으로 출력
			System.out.print(numArr[i]);
		}*/
		
		//예제 5-8
		/*int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++){
			ball[i] = i + 1;
		}
		
		int temp = 0;
		int j =0;
		
		for(int i = 0; i < 6; i++){
			j = (int)(Math.random()*10);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i = 0; i < 6; i++){
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
		}
			*/
		
		// 랜덤
		
//		Math.random(); // 0이상 1미만의 값을 반환
		
		// 0.0 ~ 0.9 / *10 / 0 ~ 9 / +1 / 1 ~ 10
		
		//문제1. 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력하라
		
				/*int[] count = new int[10];
				int[] storage = new int[10];
					
				for(int i = 0; i < storage.length; i++){
					storage[i] = i + 1;
				}
				
				for(int i = 0; i < 500; i++){
					int j  = (int)(Math.random()*10)+1;
					for(int k = 0; k < storage.length; k++){
						if(storage[k] == j){
							count[k] += 1; 
						}
					}
				}
				
				for(int i = 0; i <= 9; i++){
					System.out.printf("%d 이(가) 출력된 횟수는 %d%n", i+1, count[i]);
				}*/
		
		//문제2. 1번의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요
		
		inputRandomCount();
	}
			private static void inputRandomCount() {
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("최대값 > ");
				int max = scanner.nextInt();
				
				System.out.print("최소값 > ");
				int min = scanner.nextInt();
				
				System.out.print("반복횟수 > ");
				int rap = scanner.nextInt();
				
				int[] num = new int[max-min+1];
				
				for(int i = 0; i < rap; i++){
					int num2 = (int)(Math.random() * (max-min+1))+min;
						num[num2-min] += 1;
				} 
				for(int i = 0; i < max-min+1; i++){
					System.out.printf("%d의 출력횟수 > %d%n", min+i, num[i]);
				}
					
											
	}

}
