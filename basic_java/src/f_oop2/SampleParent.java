package f_oop2;
							// 상속받고 있지않는 클래스에 한해서
							// 상속받고 있는 클래스들은 부모클래스를 이어받아 Object메서드를 쓸수있다
public class SampleParent {
							// 원래 생략 되어있는것 
	String parentVariable;
	String var;
	
	public SampleParent(String param) {	// 생성자 단축키 ctrl + spacebar
		super();
		parentVariable = param;
	}
	
	
	public SampleParent() {
		// 생성자에서 다른 생성자를 호출할때는 this()를 사용
		this("부모변수");
	}
	
	void parentMethod(){
		System.out.println("부모 메서드");
	}
	
}
