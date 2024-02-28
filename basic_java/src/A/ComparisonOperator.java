package A;

public class ComparisonOperator {

	public static void main(String[] args) {
		 /* 1. 비교연산자
		 * - <(작다), >(크다), <=(작거나 같다), >=(크거나 같다), ==(같다), !=(같지않다)
		 * - 두개의 값을 비교하는 연산자이다.
		 * - 비교결과가 참이면 true, 거짓이면 false를 반환한다.
		 * - 대소비교는 숫자 값 비교에 사용 가능하다.
		 * - 등가비교는 모든 자료형에 사용 가능하다.
		 */
		boolean b = 1 < 2;	// true
		System.out.println(b);
		b = 1 > 2;	// false
		System.out.println(b);
		b = 1 <= 1;	// true
		System.out.println(b);
		b = 1 >= 1;	// true
		System.out.println(b);
		
		b = 1 == 1.0f;	// true - 1은 int 0.1f는 float
		System.out.println(b);
		b = 0.1 == 0.1f;	// false - 0.1은 double 0.1f는 float 
		System.out.println(b);	// double은 15자리까지 정확하게 표현하고 float은 7자리까지 정확하게표현함
								// 소수점 7자리뒤 부터 표현이 달라서 false
		System.out.printf("%22.20f%n", 0.55555555555555555555f);	// 0.55555558204650880000
		System.out.printf("%22.20f%n", 0.55555555555555555555);		// 0.55555555555555560000
		b = 0.1f == (float)0.1; // 형변환으로 같은 값을 출력하게 해줌
		
		b = "abcd" == "abcd";	// true
		System.out.println(b);
		String str = new String("abcd");	// new - 새로운 주소를 만들어서 저장하라 
		str = "abcd";						// 참조형 변수는 바로 선언을 할수 없지만 String은 예외
		b = "abcd" == new String("abcd");	// false - 같은 abcd 지만 저장된 주소가 달라서 false
		System.out.println(b);
		
		b = "abcd".equals(new String("abcd")); // equals 라는 매서드로 문자열을 비교할수 있음
		System.out.println(b);
		

	}

}
