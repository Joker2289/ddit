package homework;

import java.util.Scanner;

public class VendingMachine_16 {

	 	// 메뉴
		String[] menu = { "콜라", "사이다", "환타", "커피"};
		// 가격
		int[] price = {500, 500, 600, 700};
		// 돈통
		int[] moneybox = {500, 100, 50, 10};
		// 잔액
		int money = 0;
		// 작동 스위치(투입구)
		boolean flag = true;
		// 작동 스위치(메뉴+가격보여주기,음료선택)
		boolean flag1 = false;
		// 반환레버
		boolean lever = false;	
		
		//투입구
		void pay(){
				
			while(flag){
				System.out.print("동전 투입구 >> ");
				Scanner scanner = new Scanner(System.in);
				int m = scanner.nextInt();
				money += m;
				
				System.out.println(m + "원 넣었습니다");
				System.out.println("잔액 " + money + "원");
				System.out.println();
				if(money >= 500){
				flag = false;
				}
			}
		}
		
		
		//스위치
		void on(){
			if(money >= 500){
				flag1 = true;
			}else if(money <500){
				flag1 = false;
			}
		}
			
		//메뉴+가격 보여주기
		void show_menuprice(){
			if(flag1 = true){
				System.out.println("===============================");
				System.out.println("============ 자판기 ============");
				System.out.println("===============================");
				for(int i=0; i<menu.length; i++){
					System.out.print(menu[i] + "\t");
				}
				System.out.println();
				for(int i=0; i<price.length; i++){
					System.out.print(price[i] + "\t");
				}
				System.out.println();
				System.out.println("===============================");
				System.out.println();
				System.out.println("잔액 " + money + "원");
			}
		}
		
		//음료선택
		void select(){
			if(flag1 = true){
				System.out.print("음료를 골라주세요 > ");
				Scanner scanner = new Scanner(System.in);
				String order = scanner.nextLine();
			
				for(int i=0; i<menu.length; i++){
					if(order.equals(menu[i]) && money >= price[i]){
						System.out.println(menu[i] + "가 나왔습니다");
						money -= price[i];
						System.out.println("잔액 " + money + "원");
						break;
					}else if(money < price[i]){
						System.out.println("잔액이 부족합니다");
					}
				}
			}
		
		}
		
		//돈거슬러주기 
		void change(){
			System.out.print("반환레버 (0) > ");
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt(); 
			if(i==0){
				System.out.println("거스름돈 " + money + "원");
			}
			
		}
	
	
	
	
	
	
	
	
}
