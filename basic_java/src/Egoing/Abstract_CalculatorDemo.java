package Egoing;

public class Abstract_CalculatorDemo {
	
	public static void excute(Calculator1 cal){
		System.out.println("실행결과");
		cal.run();	
	}
	
	public static void main(String[] args) {
		Calculator1 c1 = new CalculatorDecoPlus();
		Calculator1 c2 = new CalculatorDecoMinus();
		
		c1.setOprands1(10, 20);
		c2.setOprands1(20, 40);
		
		excute(c1);
		excute(c2);
	}
}

abstract class Calculator1{
	int x, y;
	
	public void setOprands1(int x, int y){
		this.x = x;
		this.y = y;
	}
	int sum1(){
		return this.x+this.y;
	};
	
	public abstract void sum();
	public abstract void avg();
	
	public void run(){
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator1{
	@Override
	public void sum(){
		System.out.println("+ sum : "+ sum1());
	}
	@Override
	public void avg(){
		System.out.println("+ avg : "+ sum1()/2);
	}
}

class CalculatorDecoMinus extends Calculator1{
	@Override
	public void sum(){
		System.out.println("- sum : "+ sum1());
	}
	@Override
	public void avg(){
		System.out.println("- avg : "+ sum1()/2);
	}
}



