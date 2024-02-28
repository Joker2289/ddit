package f_oop2.ex_abstract;

import java.util.Arrays;

public class Starcraft {
	public static void main(String[] args) {
		
		
		Unit[] group = new Unit[4];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Marine();
		group[3] = new Dropship();
		
		for(int i=0; i<group.length; i++){
			group[i].move(100, 200);
			System.out.println(group[i]);
		}		
	}
}

class Marine extends Unit{
	int x, y;	// 현재위치
	
	//지정된 위치로 이동한다
	void move(int x, int y){
		
	}
	//현재 위치에서 정지한다
	void stop(){
		
	}
	//스팀팩을 사용한다.
	void stimPack(){
		
	}
}

class Tank extends Unit{
	int x, y;
	
	void move(int x, int y){
		
	}
	
	void stop(){
		
	}
	//시즈모드로 변환한다
	void changeMode(){
		
	}
}

class Dropship extends Unit	{
	
	//선택된 대상을 태운다
	void load(){
		
	}
	//선택된 대상을 내린다
	void unload(){
		
	}
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
}


abstract class Unit{	// 추상클래스
	int x, y; // 공통
	
	abstract void move(int x, int y);	// 유닛마다 다름 Tank와 Marine 은 지형지물에 제약을 받음
		
	
	void stop(){ // 공통
		
	}
	public String toString(){
		return "현재좌표" + x + " . " + y;
	}
}