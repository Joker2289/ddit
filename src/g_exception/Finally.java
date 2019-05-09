package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		FileInputStream fis = null; // FIS + ctrl + space
		
		try {
			//Exception의 자식 예외들은 예외 처리가 강제된다
			fis = new FileInputStream("c:/file.txt"); // 파일을 읽어오는 클래스
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(); // 에러가 발생 했을 때 볼수 있는 메시지를 출력하는 메서드
			System.out.println(e.getMessage());	// 에러메시지를 반환한다
		}finally{
			//예외 발생과 상관없이 반드시 처리해야 하는 내용을 넣어준다. finally
			try {
				fis.close();	// 닫는 행위를 할 때도 예외가 발생할 수 있기 때문에 try catch로 감쌈
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e){
				//예외와 일치하는 catch가 없으면 예외를 처리하지 못한다
				//모든 예외를 처리하기 위해서는 Exception을 사용한다.
			}
		}
		
		//실행순서
		//예외 발생 했을때 : try > catch > finally
		//예외 발생하지 않을 때 : try > finally
		
		
		//자동 자원 반환(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			//try() 안에서 객체를 생성하면 try 종료시 자동 반환된다
			fos.write(65); 
		} catch (FileNotFoundException e) {	// 자동완성 윗줄 작성 하고 ctrl
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
		
	}

}
