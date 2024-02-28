package f_oop2;

import java.util.Vector;

public class Inheritance {

	public static void main(String[] args) {
		/*
		 * 1.상속
		 * - 자식 클래스명 extends 부모클래스명{}
		 * - 기존의 클래스를 물려받아 새로운 클래스를 만드는 것이다
		 * - 부모 클래스의 생성자와 초기화블럭을 제외한 모든 멤버를 물려받는다
		 * - 클래스를 상속받는 것은 하나만 가능하다
		 * - 자식클래스는 부모 클래스의 멤버 외의 새로운 멤버를 가질 수 있으므로
		 * 	 자식클래스는 부모 클래스보다 크거나 같다
		 * - 상속받지 않는 모든 클래스는 Object 클래스를 상속 받는다
		 * 
		 * 2. super, super()
		 * - 부모 클래스명 대신 사용된다.
		 * - super는 부모 클래스의 멤버에 접근하기 위해 사용한다
		 * - super 대신 this를 사용해도 부모 클래스의 멤버에 접근할 수 있다.
		 * - 부모와 자식의 멤버가 서로 중복되어 구분이 필요할 때 super를 사용한다
		 * - 자식 클래스 생성자의 첫줄에는 super()가 있어야 한다.(없으면 생략되있는거)
		 * 
		 * 3.오버라이딩
		 * - 상속받은 메서드의 내용을 재정의하는 것이다.
		 * - 상속받은 메서드와 메서드명, 매개변수, 리턴타입이 같아야 한다.
		 * - 상속받은 메서드보다 좁은 범위의 접근제어자로 변경할 수 없다.
		 * - 상속받은 메서드보다 많은 예외를 선언할 수 있다.
		 * - static을 빼거나 더할 수 없다.
		 * 
		 * 4.다형성 
		 * - 부모타입으로 여러 자식타입들을 대신하는 것이다.
		 * - 부모타입으로 생성된 객체는 부모타입에 정의된 멤버만 사용가능하다
		 * - 부모타입과 자식타입은 서로 형변환이 가능하다
		 * - 자식타입 > 부모타입 : Up-casting(생략가능)
		 * - 부모타입 > 자식타입 : Down-casting(생략불가)
		 * - 형변환이 인스턴스에 영향을 주진 않는다.
		 * - 부모타입에서 자식타입으로 형변환시 instanceof 연산자로 인스턴스를 확인하는 것이 안전
		 * - 부모와 자식에 동일한 메서드가 있는 경우 자식의 메서드를 사용한다 - overriding된 경우
		 * - 부모와 자식에 동일한 멤버변수가 있는 경우 부모타입에서는 부모의 변수를 자식타입에서는
		 * 자식의 변수를 사용한다.
		 * 
		 * 5.제어자(접근제어자)
		 * - 외부로부터 데이터를 보호하거나 감추기 위해 사용된다
		 * - 접근제어자 : private, (default), protected, public
		 * - private : 같은 클래스 내에서만 접근이 가능하다
		 * - default : 같은 패키지 내에서만 접근이 가능하다	//접근제어자를 생략하면 기본적으로 들어감
		 * - protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근가능// 상속받음됨
		 * - public : 접근에 제한이 없다.
		 * - 그외 제어자 : static, final, abstract (더있지만 초급의 범위를 벗어남)
		 */
		
		SampleParent sp	= new SampleParent();
		SampleChild sc = new SampleChild();
		
		
		/*System.out.println(sp.parentVariable);
		sp.parentMethod();
		
		System.out.println(sc.childVariable);
		sc.childMethod();
		
		//상속받은 부모의 변수와 메서드를 사용할 수 있다.
		System.out.println(sc.parentVariable);
		sc.parentMethod();*/
		
		//부모타입과 자식인스턴스로도 선언가능
		//but 타입이 부모라 부모클래스의 멤버만 사용가능
		//but 자식클래스의 인스턴스이기 때문에 실제로 실행되는 것은 자식클래스의 메서드이다.
		/*SampleParent poly = new SampleChild();
		System.out.println(poly.parentVariable);
		poly.parentMethod(); // 자식클래스에도 오버라이딩 됐기때문에
		
		if(poly instanceof SampleChild){
			// 형변환시 검사는 예
		}*/
		
		//SampleChild test = new SampleParent(); //에러
		/*SampleChild test = (SampleChild) new SampleParent();*/
		
		
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		
		
		/*Time t = new Time();
		Time2 t2 = new Time2();
		Time3 t3 = new Time3();
		Time4 t4 = new Time4();*/
		
		/*t.setHour(17);
		t.setMinute(03);
		t.setSecond(99);
		System.out.println(t);*/
		//문제1. Time 클래스의 유효성을 체크하는 로직을 만들어주세요
		
		//문제2. Time 클래스의 시분초 셋팅시 초과되는 부분을 고려한 로직을 만들어주세요
		// 
		/*t.setSecond(100000);
	    System.out.println(t); */// 2번만하면 3:46:40 // 1번 같이하면20:50:40
		/*t2.setSecond(100000);
		System.out.println(t2);*/
		
		//t3.setSecond(10);
		//t3.setSecond(180);
		/*t3.setMinute(120);
		t3.setHour(24);*/
		
		/*t4.setHour(17);
		t4.setMinute(03);
		t4.setSecond(99);
		t4.setSecond(100000);
		t4.setSecond(20);
		t4.setSecond(30);
		t4.setMinute(60);
		t4.setHour(25);
		System.out.println(t4);*/
		
		
		/*
		 * Vector 컬렉션
		 * - add(Object) : 객체를 저장한다 저장에 성공하면 true 실패하면 false를 반환한다
		 * - remove(Object) : 저장되어 있는 객체를 제거한다. 
		 * 					   제거에 성공하면 true, 실패하면 false를 반환한다
		 * - isEmpty() : 비어있는지 검사하낟. 비어있으면 true, 채워져 있으면 false
		 * - get(int) : 지정된 위치의 객체를 반환하낟. 반환타입은 Object이므로 형변환이 필요하다
		 * - size() : 저장된 객체의 수를 반환한다.
		 */
		
		/*Vector<String> v = new Vector<String>();	//<> 안에 타입을 지정해준다 - 기본형 타입은 못넣는다
													// 참조형 타입은 ok
		
		//int > Integer (int의 참조형 타입)
		//double > Double
		//boolean > Boolean 나머지 타입들도 앞글자 대문자로 바꾸면 참조형타입
		
		v.add("A");	// 한 개씩 저장할 때마다 인덱스 0부터 차례대로 저장된다
		v.add("B");	// 인덱스 1
		v.add("C");	// 인덱스 2
		
		if(!v.isEmpty()){	// ! > 안비어있다면
			for(int i = 0; i < v.size(); i++){	//컬렉션에선 size o length x
				System.out.println(v.get(i));
			}
			v.remove("A");	// "A"와 동일한 값을 삭제한다
							// "A"가 있으면 true, 없으면 false
			System.out.println(v.size());
		}*/
		
	
		

	}

}
