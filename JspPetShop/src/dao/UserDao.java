package dao;

import model.User;

public interface UserDao {
	 public User findUserByUserNameAndPassword (String userName, String password) ;
}
