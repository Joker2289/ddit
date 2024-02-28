package f_oop2.ex_abstract.ex_interface;

//인터페이스는 개발자들 사이에 중간다리 역할
//다른사람이 다 만들때까지 기다리지 않고 인터페이스로 동시에 개발이 가능하다
//메서드의 내용은 없지만 메서드의 리턴타입과 매개변수는 있기때문 
public interface SampleInterface {	// 상속받는 애한테 구현 받는 틀을 제공한다
	// 인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야한다
	public static final int NUM1 = 1;
	// 모든 멤버변수의 제어자가 같기 때문에 생략가능
	int NUM2 = 2;
	
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다
	public abstract void method1();
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다
	void method2();
	
	//이외에 jdk1.8부터 static 메서드와 default 메서드를 사용할 수 있게 되었다
	
}
												//인터페이스는 다중구현이 가능하다 
//인터페이스를 구현 받을때는 implements				//메서드 내용이없기 때문에 메서드 이름이 같아도 상관없음 
// 상속받다 x 구현받다 o
class SampleImplement implements SampleInterface, SampleInterface2 {

	@Override
	public void method1() {
		System.out.println(NUM1);
		
	}

	@Override
	public void method2() {
		
		System.out.println(SampleImplement.NUM2);
		
	}

	@Override
	public void method3() {
		
		
	}
	
}

interface SampleInterface2 {
	void method1();
	void method3();
}




