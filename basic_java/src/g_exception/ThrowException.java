package g_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		IOException ioe = new IOException();
		
		try {
			//예외를 고의로 발생시킬 수 있다.
			throw ioe;	//강제로 에러를 발생시킴
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//RuntimeException의 자식들은 예외처리가 강제되지 않는다.
		throw new NullPointerException("예외 발생 가즈아!!"); 
		
//		System.out.println("여기는 수행되지 않아요");
	}

}
