package Egoing;

public class ReferenceParameterDemo {
	
	static void _value(int b) {
		b = 2;
	}
	
	public static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue, " + a);
	}	
	
	static void _reference1(K b) {
		b = new K(2);
	}
	
	static void runReference1() {
		K a = new K(1);
		
		_reference1(a);
		System.out.println("runReference, " +a.id);
	}
	
	static void _reference2(K b) {
		b.id = 2;
	}
	
	public static void runReference2() {
		K a = new K(1);
		_reference2(a);
		System.out.println("runReference2, " + a.id);
	}
	

	public static void main(String[] args) {
		runValue();
		runReference1();
		runReference2();
		
		
	}

}
