package Egoing;
//오버로딩 
//같은 이름이지만 매개변수가 어떤 형태고 어떤 데이터 타입이냐에 따라 다른 메서드로 생성 
class O{
	public void a(int param){
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param){
		System.out.println("문자출력");
		System.out.println(param);
	}
}

class C{
	public String x() {return "C.x";}
}

class D extends C {
	public String x() {return "D.x";}
	public String y() {return "y";}
}

class D2 extends C{
	public String x(){return "D2.x";}
	
}


public class PolymorphismOverlodingDemo {
	public static void main(String[] args) {
		/*O o = new O();
		o.a(1);
		o.a("one");*/
		
		C obj = new D();
		C obj2 = new D2(); 
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}

}
 