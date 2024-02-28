package Practice;

public class Project001 {

	public static void main(String[] args){
		//call stack
		Work2 w2 = new Work2();
		w2.cc2();
		w2.i = 2;
		System.out.println(w2.i);
		w2.mm1();	
	}
	// 윤상호, 강현욱
}

abstract class Work1{ // 강현욱
	int i;
	
	{
		i = 0;
	}
	
	abstract void mm1();
	
	public int mm2(){
		
		return 1;
	}
}

class Work2 extends Work1{

	@Override
	void mm1() {
		System.out.println("dd");
	}
	void cc2(){
		int k = mm2();	//mm2의 결과값만을 받고 싶을때 기본타입형 메서드를 쓴다
		System.out.println(k);
	}
}