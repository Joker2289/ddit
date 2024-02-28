package e_oop;

public class Restaurant {
	// 식당은 하나의 클래스 
	
	String[] menu = { "김밥", "라면", "떡볶이", "오뎅", "순대"};	
	// 전역변수 (클래스가 원래부터 가지고 있어야될것)
	// 메뉴판 (식당에가면 원래있어야될 것)
	
	// 메뉴판 좀 주세요
	String[] getMenu(){
		return menu;	// 메뉴판 갖다줌
	}
	
	// 주문이요 매개변수 + 리턴타입
	String order(String foodName){
		boolean flag = false;	// 주문이 맞는지 틀린지 확인하기 위해 만든 변수
		
		for(int i = 0; i < menu.length; i++){	// 손님이 메뉴판에 있는 음식을 시켰는지 검산
			if(foodName.equals(menu[i])){
				flag = true;
			}
		}					
		if(flag){
			return "조리된" + foodName;		// 맞는 음식을 주문했을때
		}else{
			System.out.println(foodName + "?? 그런거 안팔아요");	// 없는 음식을 주문했을 때
			return null;
		}
	}
	
	// 계산이요(돈을 주기 때문에 파라미터가 필요함)
	void pay (int money){
		if(money > 0){
			System.out.println("감사합니다. 안녕히 가세요.");
		}
	}
	
	
	
	
	
	
	

}
