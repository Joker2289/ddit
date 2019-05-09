package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {
	void method(){
		
	}
	
	//추상메서드 : 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod();	// 매개변수 넣어도되고 안넣어도 됨

}

class SampleAbstractChild extends SampleAbstractParent{
	
	//추상메서드를 상속받으면 반드시 구현해야 한다
	//상속받은 추상메서드를 추상메서드로 남겨두려면 클래스를 추상쿨래스로 변경해야한다
	@Override
	void abstractMethod() {
		
		
	}
	
}