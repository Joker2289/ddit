package A;

public class JavaBasic {

	public static void main(String[] args) {
		/*
		 * 1.변수
		 * - 단 하나의 값을 저장할 수 있는 메모리 공간
		 * - '타입 변수명'으로 선언
		 * 
		 * 2. 변수의 타입(값의 종류) - 기본값 : 0
		 * - 논리형(boolean)
		 * - 문자형(char)
		 * - 정수형(byte, short, *int, long)
		 * - 실수형(float, *double)
		 * 
		 * 3.명명규칙
		 * - 영문자, 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용 할 수 있다.(한글은 사용하지 말자)
		 * - 대소문자가 구분되며 길이에 제한이 없다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.(교재 25쪽 참고)
		 * - [기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		 * - [여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다.]
		 * - [클래스명의 첫 글자는 대문자로 한다.]
		 * - [";" 코딩할때 문장의 마침표, 찍었으면 다음줄로]
		 * 
		 * 4.타입의 크기
		 * - boolean		(1byte) : false, true
		 * - char			(2byte) : 'uffff'(0 ~ 65335)
		 * - byte			(1byte) : -128 ~ 127(-2^7 ~ 2^7 -1)
		 * - short			(2byte) : -32768 ~ 32767(-2^15 ~ 2^15 -1)
		 * - int			(4byte)	: -2147483648 ~ 2147483647(-2^31 ~ 2^31 -1, 약 -20억 ~ 20억)
		 * - long			(8byte) : -9223372036854775808 ~ 922337203685477507
		 * 							(-2^63 ~ 2^63 -1, 약 -900경 ~ 900경)
		 * - float			(4byte) : 1.4 * 10^-45 ~ 3.4 * 10^38(양의 범위만 표현됨) 
		 * 							( 똑같은 양에 음의범위도 표현가능)
		 * - double			(8byte) : 4.9 * 10^-324 ~ 1.8 * 10^308(양의 범위)
		 * 
		 * 5.형변환
		 * - 데이터의 타입을 다른 타입으로 변환하는 것
		 * - 형변환하고자 하는 데이터 앞에 변환하고자하는 타입을 괄호와 함께 붙여준다.
		 * - 형변환하고자 하는 데이터의 표현범위보다 크기가 큰 표현범위로의 변환은 생략이 가능하다.
		 * 
		 * 6.참조형변수  ex) String
		 * - 메모리에 올라간 클래스의 주소를 저장할 수 있다.
		 * - 8개의 기본형 타입외에 모든 타입이 참조형이다.
		 * - 기본값은 null 이다 	
		 * 
		 * 7.상수와 리터럴
		 * - 상수 : 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - 리터럴 : 그 자체로 값을 의미하는것
		 * 
		 * 
		 * " = " 대입연산자  bool = false;  = 의 오른쪽값을 bool이란 변수에 대입하라 -> 변수를 선언한다
		 */
		
		boolean bool;	// (논리형)변수를 선언하고
		
		bool = false;	// 값을 대입	

		byte b = 0;		// (정수형)변수 선언과 동시에 값을 대입 > 초기화
		short sh = 0;
		int i = 0;
		long l = 0;		// long l = 10000000; > 오류 
						// long l = 10000000L;
		float f = 0.0f; // 0.0; > 빨간줄 오류 > 0.0f 로 바꿈 (f는 접미사)
		double d = 0.123456789;	// float은 소수점 7자리 까지 정확하게 표현 double은 15자리까지
		
		char ch = 'A';	// char는 문자 1개밖에 표현 못함
		System.out.println(ch);
		
		ch = 65;		// 'A'를 숫자 65로 표현
		System.out.println(ch);
		
		ch = '\u0041';	// 유니코드의 A
		System.out.println(ch);	
		
		String str = "ABCD";	// String 은 "" (쌍따옴표) 씀
		str = null;
		System.out.println(str);
		
		// String은 참조형변수 // 참조형변수 - 데이터가 작성하는대로 늘어나서 따로 저장공간을 만들어 
							// 저장하고 그 주소값을 저장
		
		final int NUMBER = 0;	// 상수를 선언하기 위해선 앞에 final을 씀
		final int MAX_NUMBER = 0;	// 상수는 대문자로 표현
		
		str = "A" + 5;	// A5 - 문자 + 숫자 > 숫자를 문자화해서 출력
		System.out.println(str);
		
		str = "A" + 5 + 5;	// A55 - 왼쪽에서 오른쪽 방향으로 처리
		System.out.println(str);
		
		str = 5 + 5 + "A";	// 10A - 5+5가 먼저 이루어침 숫자 + 숫자 이므로 10 + A  문자화 되서 10A
		System.out.println(str);
		
		str = 5 + 5 + "A" + 5 + 5;	// 10A55
		System.out.println(str);
	
		str = true + "A";	// 논리값인 true도 문자화
		System.out.println(str);	
		
		str = null + "A";
		System.out.println(str);
		
		str = "\"";			// "(쌍따옴표)를 표현하고 싶을땐 앞에 \(역슬래시)추가
		System.out.println(str);
		
		str = "\""+ '\'' + "\\" + "\t탭\n줄바꿈";	// "'\	탭
		System.out.println(str);   				// 줄바꿈
		
		// 이것은 한줄 주석 - 이줄 뒤에 내용은 전부 주석 처리 단축키: ctrl + shift + c
		
		/*
		 * 이것은 여러줄주석 단축키: 처리할내용 드래그 + ctrl + shift + / 
		 * 			   해제단축키: 처리할 내용 드래그 + ctrl + shift + \
		 *
		 */
		
		int num = (int)'A';	// 65 - 형변환 문자형을 정수형 int로 형변환
		System.out.println(num);
		
		num = (int) 1.2;	// 1 - int형은 정수이므로 1만 출력
		System.out.println(num);
		
		float num2 = num;
		System.out.println(num2);	//형변환하고자 하는 데이터의 표현범위보다 크기가 큰 표현범위로의 변환은
									//생략이 가능하다.
		
	
	
	
	}

}
