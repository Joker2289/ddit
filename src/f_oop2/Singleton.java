package f_oop2;

//속도나 메모리 절약을 위해 사용하기도 한다
//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
public final class Singleton {
	//얘는 상속받을수 없는 클래스다 라는 의미로 final을 붙여주기도함
	private static Singleton instance;
	
	//생성자의 접근제어자가 private이기 때문에 다른 클래스가 상속받을 수 없다.
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){	//인스턴스화 되기전에 사용해야 한다
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
}


