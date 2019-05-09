package ch7;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;		// car =(Car)fe;에서 형변환 생략  
		//car.warter();	// 에러!! -> Car타입 참조변수로 water() 호출 못함
		fe2 = (FireEngine)car;	//자손 -> 조상
		fe2.water();

	}

}

class Car{
	String color;
	int door;
	
	void drive(){
		System.out.println("drive, Brrrr~");
	}
	
	void stop(){
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{
	void water(){
		System.out.println("water!!");
	}
}
