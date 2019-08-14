package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionUtils;
import model.User;


public class UserDaoImpl extends ConnectionUtils implements UserDao{

	@Override
	public User findUserByUserNameAndPassword(String userName, String password) {
		
List<User> userList = new ArrayList<User>();
		
		String sql1 = "SELECT *FROM user WHERE " + "Username = '" + userName + "'" + " AND password = '" +password+"'";
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql1);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User userOut = new User();
				userOut.setUserName(rs.getString("userName"));
				userOut.setPasswrod(rs.getString("password"));
				

				userList.add(userOut);
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		
		return null;
	}

}
