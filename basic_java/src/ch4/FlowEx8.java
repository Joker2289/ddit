package ch4;

import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {
		
		//switch 문
		System.out.print("주민등록 번호를 입력하세요(111111-1111111) > ");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();	// 입력받은 문자열을 regNo 에 저장
		
		char gender = regNo.charAt(7);		// 입력받은 문자열의 8번째 문자를 gender에 저장
		
		switch(gender){
			case '1': case '3':
				System.out.println("당신은 남자 입니다");
				break;
			case '2': case '4':
				System.out.println("당신은 여자 입니다");
				break;
			default:
				System.out.println("유효하지 않은 주민등록번호 입니다");
		}
		
	}

}
