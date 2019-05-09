package j_project.dao;

import java.util.ArrayList;

import j_project.vo.Database;
import j_project.vo.UserVO;

public class UserDaoImpl implements UserDao {

	@Override					//ID,     실제ID
	public UserVO selectUser(String key, String value) { //where id = 'abc'
		//유저를 찾기위하여 테이블에 접근
		for(int i=0; i<Database.tb_user.size(); i++){
			UserVO user = Database.tb_user.get(i);
			
			if(key.equals("ID")){
				if(user.getId().equals(value)){
					return user;
				}
			}
		}		
		return null;
	}//유저를 찾는 메서드

	@Override
	public void insertUser(UserVO user) {
		Database.tb_user.add(user);	
		
	}//유저를 넣는 메서드

	@Override
	public ArrayList<UserVO> selectUserList() {
		
		return Database.tb_user;
	}

}
