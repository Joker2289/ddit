package j_project.controller;

import j_project.service.UserService;
import j_project.service.UserServiceImpl;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
				
		/*
		 * Controller 	: 메뉴선택
		 * Service		: 메뉴 기능 수행
		 * Dao			: 데이터베이스 접속
		 * VO			: 데이터를 담는 클래스 A
		 * 
		 * VO와 HashMap은 선택사항 ArrayList에 담기
		 * 
		 */
		
		Scanner s = new Scanner(System.in);
		
		boolean isContinue = true;
		
		while(isContinue){
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1.회원가입");
			System.out.println("2.회원목록");
			System.out.print("메뉴에 해당하는 번호 입력 > ");
			
			int menu = s.nextInt();
			
			UserService userService = new UserServiceImpl();
			
			switch(menu){
			case 1:
				//회원가입
				userService.join();
				break;
			case 2:
				//회원목록 출력
				userService.userList();
				break;
				
			default:
				System.out.println("프로그램 종료");
				isContinue = false;
				break;
			}
			
		}
		
	}

}
