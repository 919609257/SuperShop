package shop.dao;

import java.util.List;

import shop.domain.User;

public interface userDao {

	public void addUser(User user);
	public void deleteUser(String userId);
	public void updateUser(User user);
	public List<userDao> getAllUser();
	public userDao getUserById(String userId);
	
}
