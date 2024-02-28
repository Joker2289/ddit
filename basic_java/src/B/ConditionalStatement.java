package B;

import java.util.Scanner;	// Scanner 클래스를 사용하기 위해 추가

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 1.조건문
		 * - if, switch
		 * - 조건식과 문장을 포함할 수 있는 블럭{}으로 구성되어있다.
		 * - 조건식의 연산결과에 따라 수행할 문장이 달라져 프로그램의 흐름을 변경할 수 있다.
		 * 
		 * 2.if문
		 * - 조건식의 값이 만드시 boolean형 값이 되어야 한다.
		 * - 조건식의 값이 true인 경우 {}안의 문장을 수행한 후 if문을 빠져나온다.
		 * - 경우의 수가 여럿일 경우 if문의 뒤에 else혹은 else if를 추가해 한세트로 사용한다.
		 * - {}안의 문장이 한문장일 경우 {}를 생략할 수 있다.(왠만하면 생략하지 말자)
		 * 
		 * 3. switch문
		 * - 조건식이 1개 이다.
		 * - 조건식의 값은 정수형 또는 문자열(JDK1.7버전 부터)이어야 한다.
		 * - 조건식의 값과 일치하는 case문 이후의 문장을 수행한다.
		 * - break를 만나면 switch문을 빠져나온다.
		 * - case문의 값은 중복되지 않아야한다.
		 * - 조건식의 값과 일치하는 case문이 없는 경우에는 default문을 수행한다.
		 */
		
		int i = 0;		// 영 - if문 결과값이 true이므로 블럭안의 문장을 수행한다
		if(i == 0){
			System.out.println("영");
		}
		
		int o = 1;		// 나머지 - if문 결과값이 false이므로 블럭안의 문장을 수행하지 않고 
		if(o == 0){		//         else로 넘어가 블럭안의 문장을 수행한다
			System.out.println("영");
		}else{
			System.out.println("나머지");
		}
		
		int u = 1;		// 일 이거나 이 - 결과값이 false 다음 if문 실행 true면 블럭실행 false면 else로 넘어감
		if(u == 0){
			System.out.println("영");
		}else if( u == 1 || u == 2){
			System.out.println("일 이거나 이");
		}else{
			System.out.println("나머지");
		}
		
		
		if(i != 0)	// 일보다 작다 - 1문장일 때 블럭생략
			System.out.println("영이 아니다");
		else if(i < 1)
			System.out.println("일보다 작다");
		else
			System.out.println("일보다 크다");
		
		String str1 = "abcd"; // 같지않다 
		String str2 = "abc";
		
		if(str1.equals(str2)) System.out.println("같다");
		else if (!str1.equals(str2)) System.out.println("같지않다");
		
		
		/*Scanner s = new Scanner(System.in);	// Scanner 매서드
		
		System.out.println("입력>");
		String str = s.nextLine();		// 화면을 통해 입력받은 문자열을 s에 저장 
		System.out.println("입력받은 내용 : " + str);
		
		int num = s.nextInt();
		System.out.println("입력받은 내용 : " + num);
		*/
//		grading(); // 커서를 grading안애 넣고 ctrl + 1 > enter
		
		

//		gradingUpgrade();
	

		int month = 9;
		String season = "";
		
		switch(month){
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		default:	
			break;
		}
		System.out.println(season);
	

		
		

/*	private static void grading() {
		
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	// 화면을 통해 입력받은 숫자를 scanner변수에 저장
		
		if(score >= 90){
			grade = 'A';
		}else if(score >= 80){
			grade = 'B';
		}else if(score >= 70){
			grade = 'C';
		}else{				// 조건문 안붙여도 됨
			grade = 'D';}
		
		System.out.println("당신의 점수는 " + grade + "입니다.");
		}*/
	
	

	/*private static void gradingUpgrade() {
		int score = 0;
		char grade = ' ', opt = ' ';
		
		System.out.print("점수를 입력하세요 > ");
		
		Scanner scanner = new Scanner(System.in);	// Scanner 매서드 선언 
		score = scanner.nextInt();					// 화면에서 입력받은 숫자를 score에 저장
		
		System.out.println("당신의 점수는 " + score + " 입니다");
		
		if(score >= 90){
			grade = 'A';
				if(score >= 97){
					opt = '+';
				}else if(score < 94){
					opt = '-';
				}
		}else if(score >= 80){
			grade = 'B';
				if(score >= 87){
					opt = '+';
				}else if(score <84){
					opt = '-';
				}
		}else if(score >= 70){
			grade = 'C';
				if(score >= 77){
					opt = '+';
				}else if(score <74){
					opt = '-';
				}
		}else{
			grade = 'D';
		}
		 
		System.out.println("당신의 학점은 " + grade + opt + " 입니다");
*/				
				
		
		
	}
}
