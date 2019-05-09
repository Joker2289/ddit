package exam;
class Unit{}
class AirUnit extends Unit {
}
class GroundUnit extends Unit {
}
class Tank extends GroundUnit {
}
class AirCraft extends AirUnit {
}
public class test123 {
	public static void main(String[] args) {
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		Unit u1 = new GroundUnit();
		GroundUnit gu1 = new GroundUnit();
		gu1 = (GroundUnit) u1; 
		
		//u = (Unit) ac; //AirAir
	//	u = ac; 
		   // Unit Aircraft();
		//GroundUnit gu = (GroundUnit) u;
		//AirUnit au = ac;
		//t = (Tank) u;
		//GroundUnit gu = t;
	}
}
