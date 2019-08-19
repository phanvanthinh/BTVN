package msita.jspservlet.phanvanthinh.dao;

import msita.jspservlet.phanvanthinh.model.User;

public interface UserDao {
	 public User findUserByUserNameAndPassword (String userName, String password) ;
}
