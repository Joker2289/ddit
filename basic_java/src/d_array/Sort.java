package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은수와 자리바꾸기를 
		 * 반복해 앞에서 부터 작은수를 채워나가는 방식
		 * 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 크면 자리를 바꾸기를 반복해 뒤에서부터 
		 * 큰수를 채워나가는방식
		 * 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 중간에 삽입하는 방식
		 * 석차구하기 : 모든 점수가 1등으로 시작해서 다른점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는방식
		 */

		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i + 1;
		}
		
		shuffle(numbers);	// ctrl + 1
//		System.out.println(Arrays.toString(numbers));
		
		selectSort(numbers); // 선택정렬
		bubbleSort(numbers); // 버블정렬
		insertSort(numbers); // 삽입정렬
		printRank(numbers);  //석차구하기
		System.out.println(Arrays.toString(numbers));
	}

	private static void printRank(int[] numbers) {
		
		int[] copy = new int[numbers.length];
		for(int i=0; i<numbers.length; i++){
			copy[i]=1;
		}
		
		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers.length; j++){
				if(numbers[i]<numbers[j]){	// 자기 자신과 비교 안하려면
					copy[i] += 1;			// if(i!=j && numbers[i]<numbers[j])
				}
			}
		}
		System.out.println(Arrays.toString(copy));
		
		
	}

	private static void insertSort(int[] numbers) {
		
		/*for(int i=1; i<numbers.length; i++){
			int temp = numbers[i];
			int j = 0;
			
			for(j=i-1; j>=0; j--){
				if(temp < numbers[j]){
					numbers[j+1] = numbers[j];
				}else{
					break;
				}
			}
			numbers[j+1] = temp;	// 작은수를 만나고 빠져 나와 그 작은수의 뒤칸에 들어가야해서 +1
		}
		System.out.println(Arrays.toString(numbers));*/
	}

	private static void bubbleSort(int[] numbers) {
		
		/*for(int i = 0; i<numbers.length-1; i++){ // 1회전씩 할때마다 끝에는 큰수들이 하나씪 정렬 되므로
			for(int j = 0; j<numbers.length-1-i; j++){	
				if(numbers[j] > numbers[j+1]){				
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));*/
	}

	private static void selectSort(int[] numbers) {
		/*int tmp = 0;	// 변수담을 변수
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j]){
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));	// 내가한거 */
		
		/*int tmp = 0;	// 변수담을 변수
		
		for(int i = 0; i < numbers.length - 1; i++){	//  맨 마지막수는 비교를 안하기 때문에 -1
			for(int j = i + 1; j < numbers.length; j++){	// 처음수 다음수부터 비교해야해서 i + 1
				if(numbers[i] > numbers[j]){
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));*/	// 쌤이 한거
		
	}

	
	
	private static void shuffle(int[] numbers) {			// 배열에 랜덤하게 수를 정렬하는 식
		for(int i = 0; i < numbers.length * 10; i++){
			int random = (int)(Math.random() * numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random]; 
			numbers[random] = temp;
		}

	}

}
