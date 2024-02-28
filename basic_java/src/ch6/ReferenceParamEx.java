package ch6;

class data { int x; } 

public class ReferenceParamEx {

	public static void main(String[] args) {
		data d = new data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(data d){		// 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
	
}
