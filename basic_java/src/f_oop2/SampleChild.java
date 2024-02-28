package f_oop2;

//SampleParent 클래스를 상속받는다
//상속은 하나의 클래스만 가능하다
public class SampleChild extends SampleParent {
	
	String childVariable;
	String var;
	
	public SampleChild() {
		// 부모의 변수도 초기화를 해주기 위해 super()를 사용해
		// 부모클래스의 생성자를 호출한다.
		//super()를 호출안해도 컴파일러가 자동으로 super()를 넣어준다
		//super()는 생성자의 첫줄에 와야한다
		super();
		childVariable = "자식 변수";
		// 자식클래스의 생성자에서 부모 클래스의 변수를 초기화하는 것은
		// 좋지 않은 방법이다.
//		   parentVariable = "부모변수";		
	}
	
	SampleChild(String param){
		childVariable = param;
	}
	
	
	void childMethod(){
		var	= "누구꺼지? 이건 자식꺼";
		//부모 변수와 자식변수를 구분하기위해 super를 사용한다.
		super.var = "이건 부모꺼";
		
		//이름이 중복되지 않는다면 this로도 부모 변수에 접근할 수 있다,
		this.parentVariable = "부모변수 접근";
		System.out.println("자식 메서드");
	}
	
	//오버라이딩 : 부모 메서드가 맘에 안들면 내용을 변경할 수 있다.
	//자식클래스에서 부모메서드변경
	//오버라이딩 메서드라는 것을 알려주기위해 @Override 를 붙여준다.
	@Override	// 어노테이션
	void parentMethod(){
		//오버라이딩 메서드에서 부모 메서드를 호출하기 위해 super를 사용한다
		super.parentMethod();	//부모메서드의 내용도 갖다 쓰고싶으면 
		System.out.println("오버라이딩 내용추가");
	}
	
	

	
}
