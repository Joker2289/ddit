package Egoing;

import java.util.Scanner;

/*class Fruit{
	public static final Fruit APPLE = new Fruit();	// 인터페이스의 접근제어자는 항상 static final 
	public static final Fruit PEACH = new Fruit();	// class 로 변경하면서 상수를 만들기 위해 다시 붙여준
	public static final Fruit BANANA = new Fruit(); // 각각의 과일에 Fruit 자기자신을 인스턴스화 하였다 > 각각 타입은 같지만 다른 인스턴스가 된
	private Fruit(){}
}*/

enum Fruit{ // enum 또한 class이다 
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color; //메소드를 생성하면 private 접근제어자를 두어 사용자들이 수정못하게 하는것이 바람직 
	
	public String getColor() {
		return this.color;
	}
	
	Fruit(String color) { //enum도 class이므로 생성자를 가질수 있다 
		System.out.println("Call Constructor " + this);
		this.color = color;
	}//상수들을 열거할 때마다 인스턴스화 되고 상수들이 선언될때마다 생성자가 호출된다 
}

/*class Company{
	public static final Company GOOGLE = new Company();
	public static final Company APPLE = new Company();
	public static final Company ORACLE = new Company();
	private Company(){}
}*/

enum Company{
	GOOGLE, APPLE, ORACLE;
}


public class ContentDemo {

	public static void main(String[] args) {
		/* - 설명서 
		 * 1.사과
		 * 2.복숭아
		 * 3.사과
		 */
/*		if(Fruit.APPLE == Company.APPLE) {
			System.out.println("과일애플과 회사애플이 같습니다");
		}*/
		Fruit type = Fruit.APPLE;
		switch(type) {	// switch문에서는 
			case APPLE:
				System.out.println(57 + " kcal, color " + Fruit.APPLE.getColor());
				break;
			case PEACH:
				System.out.println(34 + " kcal, color " + Fruit.PEACH.getColor());
				break;
			case BANANA:
				System.out.println(93 + " kcal, color " + Fruit.BANANA.getColor());
				break;
		}
		
		Company type2 = Company.APPLE;
		switch(type2) {
			case GOOGLE:
				System.out.println("GOOGLE Company 입니다");
				break;
			case APPLE:
				System.out.println("APPLE Company 입니다");
				break;
			case ORACLE:
				System.out.println("ORACLE Company 입니다");
				break;
		}
		
	for(Fruit f : Fruit.values()) { // enum을 사용하면 마치 배열처럼 상수들을 하나하나 꺼내서 사용할 수 있는 기능을 제공한다 
		System.out.println(f);
	}
	}

}
