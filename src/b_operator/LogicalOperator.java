package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 1. 논리연산자
		 * - &&(그리고;AND), ||(또는;OR), !(아니다;NOT)
		 * - &&와 ||는 다수의 조건을 결합할때 사용 할수 있다.
		 * - &&와 ||는 boolean형 값을 피연산자로 사용한다.(양쪽에)
		 * - !은 boolean형 값을 반대로 바꾼다. true => false, false => true
		 */
		
		boolean b;
		b = true && true;	// true - && 양쪽 다 true면 true
		System.out.println(b);
		b = true && false;	// false
		System.out.println(b);
		b = false && true;	// false - 이미 false가 나왔기 때문에  false뒤에 명령을 처리 안 함 (경고뜸 dead code) 
		System.out.println(b);
		b = false && false;	// false
		System.out.println(b);
		
		b = true || true;	// true - OR - 둘중 하나라도 true면 true 출력
		System.out.println(b);
		b = true || false;	// true - 이미 true가 나왔기 때문에 true 뒤에 명령을 처리 안 함 (경고뜸 dead code)
		System.out.println(b);
		b = false || true;	// true
		System.out.println(b);
		b = false || false;	// false
		System.out.println(b);
		
		
		boolean b2 = false;	// true
		b2 = !b2;
		System.out.println(b2);
		
		String str = "abcd";	// true
		b2 = !str.equals("abc");	// 서로다른 문자열중 하나의 앞에 !을 붙이므로 true
		System.out.println(b2);
		
		int x = 1, y = 2;
		boolean b3 = false;
		b3 = x + 3 * y > y - 2 || x < 3 && y >=5; // * 먼저, 논리연산자 끼린 && 먼저, 우선순위를 바꾸고 싶을땐 ()
		System.out.println(b3);
		
		/*
		 * 비트연산자 - bit 안에 채워진 값을 연산한다. 
		 * - &(AND), |(OR), ^(XOR), ~(비트전환), <<(쉬프트), >>(쉬프트)
		 * - 비트단위로 연산한다.
		 * - | : 피연산자 중 한 쪽의 값이 1이면, 1을 그외는 0을 결과로 얻는다.
		 * - & : 피연산자 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 * - ^ : 피연산자의 값이 서로 다를 때만 1을 같을때는 0을 결과로 얻는다.
		 * - ~ : 피연산자를 0은 1로 1은 0으로 바꾼다.
		 * - << : 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		 * - >> : 피연산자의 각 자리를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
		 * 
		 * 기타 연산자
		 * - (type) : 형변환(캐스팅)
		 * - 조건식 ? true : false (삼항연산자)
		 * - instanceof
		 */
		int num1 = 1;
		int num2 = 2;
		int num3 = (num1 > num2) ? num1 : num2; // false - 삼항연산자 왼쪽으 참거짓 묻고 참이면 num1 값을 num3
		System.out.println(num3);	//	참이면 num1 값을 num3 거짓이면 num2 값을 num3
		
		
		
		

	}

}
