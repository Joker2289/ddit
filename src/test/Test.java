package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream.GetField;

public class Test {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 1;
		
		try{
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		}catch(ArithmeticException e){
			System.out.println("이것은 오류입니다");
		}catch(Exception e){
			System.out.println("통합오류");
		}finally{
			y=3;
		}
		System.out.println(x+y);
		
		
			method();
		//   예외      /     오류
		// Exception / RuntimeException
		// 필수		 /		선택
			
	}

	private static void method() /*throws FileNotFoundException */{
		try {
			FileInputStream t = new FileInputStream("c:/file.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally{
			System.out.println("오류");
		} 
		
	}

}

