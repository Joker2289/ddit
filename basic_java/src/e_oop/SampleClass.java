package e_oop;	//소문자로씀 class의 이름과 구분 짓기위해 
				//패키지 밑에 하위 패키지가 계속 생성가능 . 으로 하위패키지 구분
import java.util.Arrays;	// 클래스가 어느 패키지에 있는 클래스인지 구분 // 단축키 ctrl+shift+o

public class SampleClass {	// 클래스 이름은 첫글자 대문자, 단어+단더(두단어의 첫글자 대문자)

	int field = 1; //클래스 구간의 변수(필드 멤버변수 전역 변수) // 메서드 안과밖 둘다 사용가능
	
	// 메서드뒤의 () - 명령을 수행하기 위해서 필요한 정보가 온다 
	// void - 돌려줘야 할게 없다
	//기본적인 메서드
	void method(){	// 메서드 안의 변수는 지역변수(메서드 안에서만 사용) 
		Arrays.toString(new int[0]);	// import를 사용하기위해 쓴것 의미x 
	}
	
	// 변수를 생성하면 메모리가 생기고 괄호안의 변수에 그 변수값이 그대로 오는게 아니라 그값을 복사해서 온다
	// 명령의 수행에 필요한 정보 : 매개변수 = 파라미터 = 아규먼트
	void method2(int parameter){
		parameter +=2;
	}
	
	// 돌려줘야 할게 있을경우 타입이 온다 - int, String ....등등
	// 명령 수행 후 결과를 돌려주는 것 : 반환타입 = 리턴타입 
	String method3(){
		return "받아라!!!";	// 돌려줘야 할땐 return을 쓰고 그뒤에 돌려줄내용	
	}
	
	// 리턴타입와 리턴타입이 모두 있는 메서드 
	int method4(int parameter){
		parameter += field;
		return parameter; 
	}
	
}
