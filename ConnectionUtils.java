package jsp.connectionUtils;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/*package isp.connetionunil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connetionutil {
	public static Connection getMyconnetion() throws SQLException {
		
		
		String hostName = "localhost";
		String dbName = "ex";
		String userName = "root";
		String password = "1211";
		String connectionURL = " jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}
	public static void main(String[] args) {
		Connection conn= null;
		try {
			conn = getMyconnetion();
			
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		System.out.println("connection successful" + conn);
	}
}*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;



public class ConnectionUtils {
	public static Connection getMyConnection() throws SQLException {
		String hostName = "localhost";
		String dbName = "ex";
		String userName = "root";
		String password = "1211";
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName,password);
		return conn;
	}}
/*	public static void main(String args[]) {
		
	
		
		int     idNews = 1;
		String  nameInput = "quoc";
		
		
		Connection connection = null;
		
		    Connection conn = null;
		try {
			conn = getMyConnection();	
			String sql = " Select * from news";
			java.sql.Statement statement =  conn.createStatement();
			ResultSet rs =  statement.executeQuery(sql);
			while (rs.next()) {
				
				
				
				News news = new News();
				
				
				int id = rs.getInt("id");
				
				String name = rs.getString("name");
				int category_id = rs.getInt("category_id");
			    String description = rs.getString("description");
			    String detail = rs.getString("detail");
				String image = rs.getString("image");
				Date date= (Date) rs.getDate("date");
		    	int user_id = rs.getInt("user_id");
		    	System.out.println("| id : "+id+ " | category_id:  " + category_id+" | name : " + name + " | description : "+description+" | detail : " + detail +" | image : "+image+" | date: "+date+" | user_id : "+user_id+" |" );
				
			}
			String sql1 = "select categories.name from categories";
			java.sql.Statement statement1 = conn.createStatement();
		  ResultSet rs1 = statement1.executeQuery(sql);
		  System.out.println("Thong tin name cua table categories: ");
		  
		  while(rs1.next()) {
			  String name = rs1.getString("name");
			  System.out.println("|name : " + name + "|");
		  }
		  
		
		 //String sql2 = "insert into  news(category_id, name, description, detail, image, date, user_id) values(" + idNews +" , '" +nameInput+"' , 'phonglep', 'chacha', 'tringtring', '2019-03-04', 2)";
		 // statement.executeUpdate(sql2);
		 // System.out.println(sql2);
		 
		 // String sql3 = "update news set category_id = " +idNews+"  where name='" +nameInput+"'";
		//  statement.executeUpdate(sql3);
		//  System.out.println(sql3);
		  
		//  String sql4 = "delete from news where name='"+nameInput+"';";
		//  statement.executeUpdate(sql4);
		//   System.out.println(sql4);
		  
		  
		  
		}
		  catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(" Connection sucessful" + conn);
	

	}}*/
	