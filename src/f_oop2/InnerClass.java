package f_oop2;

import f_oop2.Outer.InstanceInner;
import f_oop2.Outer.StaticInner;

public class InnerClass {

	public static void main(String[] args) {
		
		InstanceInner ii = new Outer().new InstanceInner(); //외부클래스를 통해 내부클래스를 
															//인스턴스화 시켜야됨
		StaticInner si = new Outer.StaticInner();
		
		Outer ot = new Outer();
		ot.method();
		
/*		System.out.println(Outer.StaticInner.inner3);
		System.out.println(Outer.StaticInner.inner3);
		
		ii.method();
		System.out.println(ii.inner1);
		System.out.println(ii.inner2);
		System.out.println(ii.var);*/
		
	}

}

class Outer {
	//인스턴스 변수
	int instanceVar = 1;
	int var = 10;
	int Var2 = 20;
	//인스턴스 클래스 
	class InstanceInner{
		//내부클래스에서는 밖에있는 멤버에 직접 접근할 수 있다.
		int inner1 = instanceVar;
		int inner2 = classVar;
		int var = 20;
		
		void method(){
			int var = 30;
			
			System.out.println(var); // 지역변수와 전역변수가 이름이 같을때 지역변수가 우선순위 높음
			System.out.println(this.var); // 전역변수
			System.out.println(Outer.this.var);	// 외부클래스 변수
	}
}
	//클래스 변수
	static int classVar = 2;
	//스태틱 클래스
	static class StaticInner {
		//스태틱 클래스 에서는 클래스멤버(static)만 사용가능 
//		int inner1 = instanceVar; // static에서는 인스턴스변수를 사용 못함
		int inner2 = classVar;
		static int inner3 = classVar;
	}
	
	void method(){
		//지역변수
		int localVar1 = 3;		//jdk1.8부터는 지역 클래스가 참조하는 변수에 컴파일러가 자동으로
		final int localVar2 = 4;//final을 붙여줌 
		//지역클래스 - 메서드안에서 만든 클래스
		class LocalInner {
			//지역 클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용가능하고 
			//final이 붙은 지역 변수도 사용가능
			int inner1 = instanceVar;	//인스턴스멤버
			int inner2 = classVar;		//클래스멤버 모두 사용가능
//			int inner3 = localVar1;		//에러 - final이 붙지않은 지역 변수는 사용불가
			int inner4 = localVar2;
		}
		//지역클래스는 메서드내부에서 인스턴스화를 통해 사용 가능
		LocalInner li = new LocalInner();	// 인스턴스화
		System.out.println(li.inner1);
		System.out.println(li.inner2);
		System.out.println(li.inner4);
	}
	
	public static void InstanceInner() {
		// TODO Auto-generated method stub
		
	}

	void test1(){
		//인스턴스 클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야한다
		InstanceInner ii = new InstanceInner();
		System.out.println(ii.inner1);
		System.out.println(ii.inner2);
		
		//클래스멤버는 클래스를 통해서 바로 접근할 수 있는것과 같이 스태틱 클래스는 클래스를 통해서 바로 접근
		//할 수 있다.
		System.out.println(StaticInner.inner3);
		
		//스태틱클래스의 인스턴스멤버에 접근하기 위해서는 인스턴스화를 해야한다
		InstanceInner si = new Outer.InstanceInner();	// 외부클래스를 통해서
		System.out.println(si.inner2);
	}
	
	static void test2(){
		Outer o = new Outer();
		InstanceInner ii = o.new InstanceInner();
		System.out.println(ii.inner1);
		System.out.println(ii.inner2);
		System.out.println(StaticInner.inner3);
		
		StaticInner si = new Outer.StaticInner();
		System.out.println(si.inner2);
	}

}