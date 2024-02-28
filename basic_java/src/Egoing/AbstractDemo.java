package Egoing;

public class AbstractDemo {

	public static void main(String[] args) {
	
	B obj = new B();
	
	System.out.println(obj.b());
	obj.d();
	}

}

//직접적으로 사용할 수 없고 상속해서 사용하도록 강제하는 것 
abstract class A{
	
	public abstract int b();	//추상메서드
	//본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//public abstract int c() {System.out.println("hello");}
	//추상 클래스 내에는 추상 메소드가 아닌 메서드가 존재할수 있다
	
	public void d(){
		System.out.println("world");
	}
}

class B extends A{
	
	@Override
	public int b(){
		return 1;
	}
}