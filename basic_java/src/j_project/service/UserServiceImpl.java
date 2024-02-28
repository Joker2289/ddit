package j_project.service;

import j_project.dao.UserDao;
import j_project.dao.UserDaoImpl;
import j_project.vo.UserVO;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
				//UserService를 Implement 했다
	
	UserDao userDao = new UserDaoImpl();
	
	@Override
	public void join() {
		//회원가입
		Scanner s = new Scanner(System.in);
		
		UserVO user = new UserVO();
		
		System.out.print("ID : ");
		user.setId(s.nextLine());
		System.out.print("PW : ");
		user.setPw(s.nextLine());
		System.out.print("name : ");
		user.setName(s.nextLine());
									                  //실제유저
		UserVO userCheck = userDao.selectUser("ID", user.getId());	//Id를 가지고 유저를 찾는다
		
		if(userCheck == null){
			//회원가입 진행
			userDao.insertUser(user);
		}else{
			//아이디 중복
			System.out.println("아이디가 중복 되었습니다");
		}
	}

	@Override
	public void userList() {
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		System.out.println("===========================================");
		for(UserVO user : userList){	//향상된 for문
			System.out.println("ID : " + user.getId());
			System.out.println("name : " +user.getName());
		}
		System.out.println("===========================================");
	}

}
