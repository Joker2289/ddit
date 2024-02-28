package dao;

import vo.AdminVO;

public interface AdminDao {
	
	AdminVO SelectAdmin(String key);
	void insertAdmin(AdminVO admin);
	
}
