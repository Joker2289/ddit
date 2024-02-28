package e_oop;

public class RestaurantGroup {

	static String ceo = "박정권";	//명시적 초기화 - 선언과 동시에 초기화 실행순서1
	//static 개체생성을 하지 않아도 접근 할수 있다 (JVM때문)- 클래스멤버
	static String[] restaurants;	//체인점 목록
	static String[][] menus;		//체인점들 메뉴 목록
	String[] menu; 			//선택한 체인점 메뉴
	
	static {	//초기화 블럭을 통한 초기화 실행순서2
		restaurants = new String[]{"분식집", "중국집", "버거집"};
		
		menus = new String[3][];
		menus[0] = new String[]{"김밥", "라면", "떡볶이", "오뎅", "순대"};
		menus[1] = new String[]{"짜장면", "짬뽕", "볶음밥", "탕수육"};
		menus[2] = new String[]{"불고기버거", "와퍼", "상하이버거", "콜라", "사이다", "감자튀김"};
	}
	
	//클래스이름과 동일한 메서드 생성 - 생성자
	//생성자는 인스턴스변수를 초기화하거나 인스턴스화 할때 필요한 작업을 위해 사용한다.
	RestaurantGroup(String name){
		//생성자를 통한 초기화 실행순서3
		// 음식점 셋중에 하나를 선택하는 
		if(name.equals("분식집")){
			menu = menus[0];
		}else if(name.equals("중국집")){
			menu = menus[1];
		}else if(name.equals("버거집")){
			menu = menus[2];
		}
		// 생성자는 리턴값이 없다
	}
	
	//메서드의 타입이나 매개변수가 다르면 중복이름을 사용할수 있다 - 오버로딩(생성자뿐아니라 메서드도 가능)
	RestaurantGroup(){
		this ("버거집"); //생성자에서 생성자를 호출 할때는 
		                //그냥 RestaurantGroup()(생성자)이름을 쓰면 안됨 
						//반드시 this는 클래스명 대신 쓴다 
						//this는 생성자내 맨위에 있어야한다.
	}
	
	//메뉴판좀 주세요
	String[] getMenu(){
		return menu;
	}
	//주문이요
	String order(String menu){	
		boolean flag = false;
		
		for(int i=0; i< this.menu.length; i++){	//위의 지역변수 메뉴와 전역변수 메뉴이름이 같기때문에 
			if(menu.equals(this.menu[i])){		//this 붙임
				flag = true;
			}
		}
		
		if(flag){
			return "조리된" + menu;
		}else{
			System.out.println(menu + "?? 그런거 안팔아요");
			return null;
		}
	}
	
	// 주문을 여러개 받을 때 
	String[] order(String[] menu){
		boolean[] flag = new boolean[menu.length];	// 
		String[] rtnMenu = new String[menu.length]; 
		
		for(int i=0; i<menu.length; i++){
			for(int j=0; j<this.menu.length; j++){
				if(menu[i].equals(this.menu[j])){
					flag[i] = true;
				}
			}
		}
		for(int i=0; i<flag.length; i++){
			if(flag[i]){
				rtnMenu[i] = "조리된"	 + menu[i];
			}else{
				System.out.println(menu[i] + "? 그런거 안팔아요");
			}
		}
		return rtnMenu;
		
	}
	
	//계산이요
	void pay(int money){
		if(money > 0){
			System.out.println("감사합니다. 안녕히 가세요");
		}
	}
	
	
	
}
