package test;


class Product{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	Product(int price) {

		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}
	
class Tv extends Product {
	Tv() {
		super(8);	
	}
	
	public String toString() {
		return "Tv";
	}
}


public class Excercise7_5 {

	public static void main(String[] args) {
		Tv t = new Tv();
	}

}
