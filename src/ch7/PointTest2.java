package ch7;

public class PointTest2 {

	public static void main(String[] args) {
		Point3D2 p2 = new Point3D2();
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		System.out.println("p2.z = " + p2.z);

	}

}

class Point2{
	int x = 10;
	int y = 20;
	
	Point2(int x, int y){
		// super(); 생략, 컴파일 자동추가 - Point2의 조상인 Object클래스의 기본생성자
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2{
	int z = 30;
	
	Point3D2(){
		this(100, 200, 300);	//Point3D2(int x, int y, int x)를 호출한다.
	}
	
	Point3D2(int x, int y, int z){
		super(x, y);	// Point2(int x, int y) 를 호출한다	
		this.z = z;
		
	}
}
