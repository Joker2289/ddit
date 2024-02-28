package Egoing;

class K{
	public int id;
	
	K(int id){
		this.id = id;
	}
}
public class ReperenceDemo1 {
	
	public static void runValue() {	
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " + a);
		System.out.println("runValue, " + b);
		
	}
	
	public static void runReference() {	//참조 
		K a = new K(1);
		K b = a;
		b = new K(2);
		System.out.println("runReference, " + a.id);
		
	}

	public static void main(String[] args) {
		runValue();
		runReference();
	}

}



