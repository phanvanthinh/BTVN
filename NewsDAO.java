package jsp.connectionUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jsp.connectionUtils.ConnectionUtils;
import jsp.connectionUtils.ICustomerDAO;
import jsp.connectionUtils.News;

import com.mysql.cj.xdevapi.Statement;

public class NewsDAO extends ConnectionUtils implements ICustomerDAO {
    public static Scanner sc = new Scanner(System.in);

	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		Connection conn = null;
		 try {
	conn = getMyConnection();
	java.sql.Statement stt = conn.createStatement();
   
		 System.out.println("Nhap ID News: ");
	     int id = sc.nextInt();
	     System.out.println("Nhap ID category: ");
	     int category_id = sc.nextInt();
	     System.out.println("Nhap Names: ");
	     String name = sc.nextLine();
	     System.out.println("Nhap Description: ");
	     String description = sc.nextLine();
	     System.out.println("Nhap Details: ");
	     String detail = sc.nextLine();
	     System.out.println("Nhap Image: ");
	     String image = sc.nextLine();
	     System.out.println("Nhap Date: ");
	     String date = sc.nextLine();
	     System.out.println("Nhap ID User: ");
	     int user_id = sc.nextInt();
		 String sql = "insert into news(category_id,name,description,detail,image,date,user_id) values("+id+",'"+category_id+"','"+ name+"','"+description+"','"+detail+"','"+image +"','"+date +"','"+user_id+"')";
		 System.out.println(sql);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteCustomerByName(String s) {
		// TODO Auto-generated method stub
		String sql1 = "delete from news Where name ='" + s + "'";
		System.out.println(sql1);
		Connection conn = null;
		 try {
			 conn = getMyConnection();
			 java.sql.Statement stt = conn.createStatement();
			stt.execute(sql1);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		 }
	
	
	

	@Override
	public void findCustomerByName(String s) {
		// TODO Auto-generated method stub
		List<News> list = new ArrayList<News>();
		
		String sql2 = "select *from news where name = '" + s + "';";
		ResultSet rs = null;
		Connection conn = null;
		 try {
			 conn = getMyConnection();
			 java.sql.Statement stt = conn.createStatement();
				rs = stt.executeQuery(sql2);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	}
		 try {
				while (rs.next()) {
					News news = new News(0, 0, sql2, sql2, sql2, sql2, sql2, 0);
					int id = rs.getInt("id");
					news.setId(id);
					int cate = rs.getInt("category_id");
					news.setCategory_id(cate);
					String name = rs.getString("name");
					news.setName(name);
					String des = rs.getString("description");
					news.setDescription(des);
					String detal = rs.getString("detail");
					news.setDetail(detal);
					String image = rs.getString("image");
					news.setImage(image);
					Date date = (Date) rs.getDate("date");
					news.setDate(date.toString());
					int user_id = rs.getInt("user_id");
					news.setUser_id(user_id);
					list.add(news);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("id   " + "       name     " );
			for(News news : list) {
				System.out.println(news.getId() + "              "  + news.getName());
			}
		}	 
	

	@Override
	public void getCustomer() {
		// TODO Auto-generated method stub
	List<News> list = new ArrayList<News>();
		
		String sql3 = "select *from news";
		ResultSet rs = null;
		Connection conn = null;
		 try {
			 conn = getMyConnection();
			 java.sql.Statement stt = conn.createStatement();
				rs = stt.executeQuery(sql3);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	}
		 try {
				while (rs.next()) {
					News news = new News(0, 0, sql3, sql3, sql3, sql3, sql3, 0);
					int id = rs.getInt("id");
					news.setId(id);
					int cate = rs.getInt("category_id");
					news.setCategory_id(cate);
					String name = rs.getString("name");
					news.setName(name);
					String des = rs.getString("description");
					news.setDescription(des);
					String detal = rs.getString("detail");
					news.setDetail(detal);
					String image = rs.getString("image");
					news.setImage(image);
					Date date = (Date) rs.getDate("date");
					news.setDate(date.toString());
					int user_id = rs.getInt("user_id");
					news.setUser_id(user_id);
					list.add(news);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("id   " + "          name     " );
			for(News news : list) {
				System.out.println(news.getId() + "              "  + news.getName());
			}
		}
	

	@Override
	public void updateCustomerByName(String s) {
		// TODO Auto-generated method stub
		System.out.println("Input update name");
		String name = sc.nextLine();
		String sql4 = "update news set name ='"+ name + "'" + " where name ='"   + s + "'";
		Connection conn = null;
	
		try {
			conn = getMyConnection();
			java.sql.Statement stt = conn.createStatement();
			stt.execute(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
	public void menu(){	
		// TODO Auto-generated method stub
		     String s = null;
		do {	
			System.out.println("MENU");
			System.out.println("1.Add");
			System.out.println("2.Delete");
			System.out.println("3.Find");
			System.out.println("4.Show");
			System.out.println("5.Update");
			System.out.println("0.Exit");
			System.out.println("=========================");
			System.out.println("Nhap vao gia tri: ");
			int i = sc.nextInt();
			switch(i) {
			case 1:
				addCustomer();
				break;
			case 2:
				deleteCustomerByName(s);
				break;
			case 3:
				findCustomerByName(s);
				break;
			case 4:
				getCustomer();
				break;
			case 5:
				updateCustomerByName(s);
				break;
			case 0:
				break;

			default:
				System.out.println("Moi ban nhap lai:");
				break;
			}	
		}
		while (true);
		}

		
		
		
}

	

	