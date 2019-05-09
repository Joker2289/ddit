package C;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {	// 프로그램을 시작과 동시에 실행하고싶을 때 사용
		/*
		 * 1.String의 주요 메서드
		 * - equals() : 문자열의 내용이 같은지 확인한다.
		 * - toCharArray() : 문자열을 문자배열로 반환한다.
		 * - length() : 문자열의 길이를 반환한다.
		 * - charAt() : 문자열에서 해당 인덱스에 있는 문자를 반환한다.
		 * - substring() : 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 * - indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 * - split() : 문자열을 특정 문자열을 기준으로 나누어 배열로 변환한다.
		 * - replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다. 
		 */
		// char배열이 문자열
		
		String str = "abcd,efg"; // == char[] str = {'a', 'b', 'c', 'd', ',', 'e', 'f', 'g'}
		
//		char[] charArray = str.toCharArray();	// 문자열 출력		
//		System.out.println(charArray);
		
//		for(int i=0; i<str.length(); i++){	// length라는 메서드를 호출
//			System.out.println(str.charAt(i));	// 인덱스에 해당하는 문자를 출력
//		}
		
//		System.out.println(str.substring(3));	// 문자열의 3번인덱스 부터 마지막까지 잘라서 반환
		
//		System.out.println(str.substring(1, 4));	// 1번인덱스부터 4번인덱스 전까지(4번인덱스 포함 x)
		
//		System.out.println(str.substring(0, str.indexOf(",")));
		// 인덱스 0부터 ',' 문자 전까지 자름 // indexOf - 문자의 인덱스 위치를 알려줌
		// ',' 가 여러개 있다면 젤 앞에꺼
		System.out.println(str.substring(0, str.lastIndexOf(",")));
		// 여러개의 ','중 마지막 ,의 인덱스를 찾음
		
		String[] split= str.split(",");	// ','를 기준으로 나눔(,는 없어짐) (abcd) (efg) 2개의 배열로 반환함
		System.out.println(Arrays.toString(split));	
		
		System.out.println(str.replace("efg", "abcd"));	//efg를 abcd로 바꿈
		
		for(String arg : args){
			System.out.println(arg);
		}
		
		
	
		
		//문제1. 숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력하라
		setComma();
		//문제2. 하이픈(-)이 있는 전화번호를 입력받아 하이픈을 제거해 출력하라
		removeHyphen();
		//문제3. 하이픈(-)이 없는 전화번호를 입력받아 하이픈을 삽입해 출력하라
		setHyphen();
	}

	private static void setHyphen() {
		
		
		
	}

	private static void removeHyphen() {
		/*
		System.out.print("전화번호를 입력해주세요 > ");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		
		System.out.println(num.replace("-", ""));*/
		
		
	}

	private static void setComma() {
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력해주세요 > ");
		String num = scanner.nextLine();
		
		int count = 0;
		String result = "";
		
		for(int i = num.length()-1; i>-1; i--){
			result = num.charAt(i) + result;
			
			if((count+1) % 3 == 0 && i!=0){	
				result = "," + result;
			}
			count++;
		}
		System.out.println("출력 > " + result);*/
		
		// char배열과 String클래스의 차이
		// String객체(문자열)는 읽을 수만 있을 뿐 내용을 변경할 수 없다는 것이다.
		
		/*Scanner s = new Scanner(System.in);
		
		System.out.print("입력 > ");
		String number = s.nextLine();
		String newNumber = "";
		
		int cnt = 0;
		for(int i = number.length() - 1; i >= 0; i--){
			newNumber = number.charAt(i) + newNumber;
			
			cnt++;
			
			if(cnt % 3 == 0 && cnt != number.length()){
				 newNumber = "," + newNumber;
			}
		}
		System.out.println(newNumber);*/
		
	}

}
