package g_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			method();
		} catch (IOException e) {
			// 넘겨받은 예외를 처리한다
			e.printStackTrace();
		}
		
		try {
			method2();
		} catch (FileNotFoundException e) {
			//예외를 넘겨받아 처리를 분담한다
			e.printStackTrace();
		}

	}
	
	
	private static void method2() throws FileNotFoundException {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("일부예외처리");
			throw e;
		}
		
		
	}
						//메서드에 예외를 선언 - 예외를 처리하지 않고 메인메서드로 넘겨준다 
	private static void method() throws IOException {
		throw new IOException();
		
	}

}
