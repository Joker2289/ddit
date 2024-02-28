package ch6;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4);	//Car(String color, String gearType, int door)를 호출
	}
	Car(Car c){		//인스턴스 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		
		System.out.println("c1 color = " + c1.color + ", gearType = " + c1.gearType 
				+ ", door = " +c1.door);
		System.out.println("c2 color = " + c2.color + ", gearType = " + c2.gearType 
				+ ", door = " +c2.door);
		
		c1.door = 100;	// c1의 인스턴스 변수 door의 값을 변경한다.
		System.out.println("c1.door = 100; 수행 후");
		System.out.println("c1 color = " + c1.color + ", gearType = " + c1.gearType 
				+ ", door = " +c1.door);
		System.out.println("c2 color = " + c2.color + ", gearType = " + c2.gearType 
				+ ", door = " +c2.door);
	}

}
