package f_oop2;

import java.util.Vector;

public class Store {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		Desktop d = new Desktop();
		System.out.println(d.getInfo());
		
		Product l = new Laptop();
		System.out.println(l.getInfo());
		
		c.buy(d);
		System.out.println("남은돈 : " + c.money + "원 / 포인트 : " + c.point + "점");
		
		c.buy(l);
		System.out.println("남은돈 : " + c.money + "원 / 포인트 : " + c.point + "점");
		
		c.showItem();
		
		c.refund(d);
		c.refund(l);
		c.refund(d);
	}

}

//여러가지 물건들이 공통으로 상속받을 수 있는 클래스를 만든다.
class Product{
	int price;
	int point; 
	
	//생성자에서 가격과 포인트를 초기화
	public Product(int price) {
		this.price = price;
		point = price / 10;
	}
	
	//상품의 정보를 반환하는 메서드
	String getInfo(){
		return "가격 : " + price + "원 / 포인트 : " + point + "점";
	}
	
}


class Desktop extends Product{
	
	public Desktop() {
		//부모 클래스의 생성자 호출
		super(1000); 
	}
	
	//오버라이딩 메서드 
	@Override
	String getInfo(){
		return "Desktop - " + super.getInfo(); // 부모클래스의 메서드 호출
	}
	
	public String toString(){	// 반환한 글자를 출력하기 위한 메서드
		return "Desktop";		// 오브젝트에서 오버라이딩된 메서드
	}
}

class Laptop extends Product{
	
	public Laptop() {
		super(2000);
	}
	
	//오버라이딩 메서드 
		@Override
		String getInfo(){
			return "Leptop - " + super.getInfo(); // 부모클래스의 메서드 호출
	}
		
	public String toString(){	// 반환한 글자를 출력하기 위한 메서드
		return "Leptop";		// 오브젝트에서 오버라이딩된 메서드
	}
		
}

class Customer{	//오브젝트 상속받음
	int money = 10000;	//명시적 초기화
	int point = 0;
	
	Vector<Product> item = new Vector<Product>();	// Customer에 장바구니 만들어줌
							// 부모타입으로 지정해주면 자식들도 저장될 수 있다.		
	
	// 구매할 때 받을 파라미터의 타입으로 물건들의 부모클래스를 지정해주면
	// 자식클래스 모두를 받을 수 있다.
	void buy(Product p){	// 부모타입의 변수를 받으면 랩탑 데스크탑 둘다 올수있다
			if(money < p.price){
				System.out.println("잔돈이 부족하네 ㅅㅂ");
				return;	// 원래 생략되 있음 리턴만나면 아래문장 수행안하고 빠져나감
			}
		
			money -= p.price;
			point += p.point;
			
			item.add(p);
			System.out.println(p + "!!득템!!");			
	}						// buy메서드에 toString 메서드가 없지만
							// p가 실행되면서 l,d 안에들어있던 toString이 실행됨
	
	void showItem(){
		String items = "장바구니 : ";
				
			for(Product item : this.item){
				items += " " + item;
			}
			System.out.println(items);
	}
	
	
	//문재1. 환불하는 메서드를 만들어 주세요
	void refund(Product p){
		if(item.remove(p)){
			item.remove(p);
			money += p.price;
			point -= p.point;
			System.out.println(p + "가 환불되었습니다");
			showItem();
			System.out.println("남은돈 : " + this.money + "원/ 포인트 : " + this.point + "점" );
		}else{
			System.out.println("없는 상품입니다");
		}		
	}
	
	
	
	
	
	
}