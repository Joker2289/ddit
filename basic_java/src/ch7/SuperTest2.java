package ch7;

public class SuperTest2 {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.method();
		
		Point3D x = new Point3D();
		x.x = 1;
		x.y = 3;
		x.z = 7;
		System.out.println(x.getLocation());
	}

}

class Parent1{
	int x = 20;
}

class Child1 extends Parent1{
	int x = 30;
	void method(){
		System.out.println("x = " + x );
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}


			
class Point1{
	int x;
	int y;
	
	String getLocation(){
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point1{
	int z;
	
	String getLocation(){	// 오버라이딩
		// return "x : " + x + "y : " + y + "z : " + z;
		return  super.getLocation() + ", z : " + z;
		
	}
	
}