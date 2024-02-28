package f_oop2.ex_abstract.ex_interface;

public class Starcraft {

	public static void main(String[] args) {
		SCV scv = new SCV();
		
		scv.repair(new Tank());
				
	}

}

class Unit {
	int hp;	//현재체력
	final int MAX_HP; //피통
	
	public Unit(int hp)	{
		MAX_HP = hp;
		this.hp = MAX_HP;
	}	
}

class Marine extends Unit{
	public Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	public Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	public Dropship(){
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	public SCV() {
		super(60);
	}
	
	void repair(Repairable r){	//Tank와 Dropship SCV 만 수리가능 Unit으로 받으면 Marine까지 포함됨
		//Refairable 인터페이스를 상속받게 함으로써 수리가 가능한 유닛을 구분했다.
		//그러나 Refairable에는 멤버가 없기 때문에 아무것도 할 수 없다.
		//hp를 멤버로 가진 Unit으로 형변환을 해줘야한다
		if(r instanceof Unit){	// Unit의 유닛이면 true 아니면 false
			Unit u = (Unit) r;	// 형변환	 	// 아무관계도 없지만 자식 클래스가
								//  		Repairable, Unit 둘다 상속받으므로 형변환가능
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}						
	}
}

interface Repairable{	
	
}

