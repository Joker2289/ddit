package h_lang;

import java.util.Vector;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할때 대신 사용하는 클래스
		 * 
		 * boolean	: boolean
		 * char 	: Charactor
		 * byte 	: Byte
		 * short 	: Short
		 * int 		: Integer
		 * long 	: Long
		 * float 	: Float
		 * double 	: Double
		 */
		
		int i = 10;
		Integer iw = new Integer(20);
		
		System.out.println(i + iw);	// int변수 두개 쓰듯 사용하면 된다
		
		//Wrapper 클래스의 부가기능
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		//int의 표현범위 
		
		System.out.println(i + "20");	// 1020 
		System.out.println(i + Integer.parseInt("20"));	// 문자를 숫자열로 바까줌
		System.out.println(i + String.valueOf(20));	// 숫자를 문자열로 바까줌
		System.out.println(i + Integer.valueOf("20"));
		
		Vector<Integer> v = new Vector<Integer>();
		//타입을 Integer로 정해줌 
		
		v.add(new Integer(10)); // Integer 객체 가 올수 도 있고
		v.add(10);	// 그냥 정수가 올수도 있다
					// 오토박싱 : 기본형 타입이 Wrapper클래스로 자동 형변환
		
		int i2 = v.get(0);	//0번 인덱스를 불러옴
							//언박싱 : wrapper클래스가 기본형 타입으로 자동 형변환
		
	}

}
