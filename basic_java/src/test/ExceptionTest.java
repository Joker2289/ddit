package test;

import java.io.FileNotFoundException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		// 예외	/  에러
		// Exception / RuntimeException
		// 강제		 / 꼴리면
		
		int x = 10;
		int y = 0;
		try{
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		}catch(ArithmeticException e){
			System.out.println("수학적오류");
		}catch(Exception e){
			System.out.println("통합오류");
		}finally{
			System.out.println("무조건 실행됨");
		}
		
		
		

	}

}
