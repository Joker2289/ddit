package Egoing;

public class CalculatorDemo {

	public static void main(String[] args) {
		//아래의 로직이 1000줄 짜리 복잡한 로직이라 생각하자
		System.out.println(10 + 20);	
		System.out.println(20 + 40);
		//중복의 제거
		//값은 중복되지 않는다
		// + 라는 연산이 중복되므로 메소드를 이용해 중복을 제거하자 > refactoring
		// refactoring 장점 
		// sum이라는 로직을 다른 로직에 갖고갈수 있다
		// 유지보수 편의성이 높아진다
		// 가독성이 향상됐다 - 보는사람으로서 코드가 어떻게 동작하는지 쉽게 알 수 있다.
		
		sum(10, 20);
		sum(20, 40);
		avg(40, 20);
		
		int x,y;
		x=10;
		y=20;
		sum(x, y);
		avg(x, y);
		
		x=20;
		y=40;
		sum(x, y);
		avg(x, y);
	}
	
	
	
	
	
	public static void sum(int x, int y){
		System.out.println(x+y);
	}
	
	public static void avg(int x, int y){
		System.out.println((x+y)/2);
	}
	

}
