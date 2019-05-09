package Egoing;

public class CalculatorDemo2 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();	// 객체를 생성 해서 c1이라는 변수에 담는다
		c1.setOprands(10, 20);				// 담겨진 실제 객체의 내용을 > instance화 
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		
		System.out.println(c2);
		System.out.println(c2.toString());
		
		String a = c1.toString();
		System.out.println(a);
	}
}

class Calculator{
	int x,y;
	
	void setOprands(int x, int y){
		this.x = x;			
		this.y = y;
	}
	
	void sum(){
		System.out.println(this.x+this.y);
	}
	
	void avg(){
		System.out.println((this.x+this.y) / 2);
	}
	
	public String toString(){
		return "x = " + this.x + " y = " + this.y;
	}
	
}