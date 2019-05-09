package ch4;

import java.util.Scanner;

public class FlowEX32 {

	public static void main(String[] args) {
		
		//continue 문
		
		/*int menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("(1) 강예빈");
			System.out.println("(2) 문채원");
			System.out.println("(3) 청하");
			System.out.println("(4) 선미");
			System.out.println("(5) 이국주");
			System.out.print("원하는 여자를 골라보세요(없으면 : 0) > ");
			
			menu = scanner.nextInt();
			
			if(menu == 0){
				System.out.println("?? 오징어새끼가 꺼져~");
				break;
			}else if(!(1 <= menu && menu <= 5)){
				System.out.println("보기중에 고르라고 등신아");
				continue;
			}
			System.out.println("선택하신 여자는 " + menu + "번 재밌게 노세요 ^^");
			break;
		}*/
		
		
		int menu = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("(1) 강예빈");
			System.out.println("(2) 문채원");
			System.out.println("(3) 청하");
			System.out.println("(4) 선미");
			System.out.println("(5) 이국주");
			System.out.print("원하는 여자를 골라보세요(없으면 : 0) > ");
			
			menu = scanner.nextInt();
			
			if(menu == 0){
				System.out.println("?? 오징어새끼가 꺼져~");
				break;
			}else if(!(1 <= menu && menu <= 5)){
				System.out.println("보기중에 고르라고 등신아");
				continue;
			}
				if(menu == 1){
				System.out.println("선택하신 여자는 [강예빈]입니다 [몸매가 예술이죠] 재밌게 노세요 ^^");
				break;
			}else if(menu == 2){
				System.out.println("선택하신 여자는 [문채원]입니다 [졸라게 예쁘니] 재밌게 노세요 ^^");
				break;
			}else if(menu == 3){
				System.out.println("선택하신 여자는 [청하]입니다 [노래잘하고 이쁜 기지배에요] 재밌게 노세요 ^^");
				break;
			}else if(menu == 4){
				System.out.println("선택하신 여자는 [선미]입니다 [말이 필요없으니] 재밌게 노세요 ^^");
				break;
			}else if(menu == 5)
				System.out.println("씨발 취향 독특하네");
				break;
		}
		
		

	}

}
