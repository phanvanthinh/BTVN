package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionUtils;
import model.Orderr;

public class OrderDaoImpl extends ConnectionUtils implements OrderDao{

	

	@Override
	public List<Orderr> findAll() {
		List<Orderr> listOrder = new ArrayList<Orderr>();
		String sql ="select *from Orderr";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs =null;
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			rs =pr.executeQuery();
			while(rs.next()) {
				Orderr order = new Orderr();
				order.setCustomerName(rs.getString("Customer_Name"));
				order.setGender(rs.getString("Gender"));
				order.setAge(rs.getInt("Age"));
				order.setPhoneNumber(rs.getInt("Phone_Number"));
				order.setAddress(rs.getString("Address"));
//				order.setTotal(rs.getInt("Total"));
				order.setStatus(rs.getString("Status"));
				listOrder.add(order);
				
			}
		
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return listOrder;
	}

	@Override
	public void addOrder(Orderr order) {
		String sql = "insert into orderr(Customer_Name, Gender, Age, Phone_Number, Address) values ('"+order.getCustomerName()+"','"+order.getGender()+"', "+order.getAge()+", "+order.getPhoneNumber()+", '"+order.getAddress()+"');";
	    Connection cnn = null;
	    PreparedStatement pr = null;
	    try {
	    	cnn = super.getMyConnection();
	    	pr = cnn.prepareStatement(sql);
	    	pr.executeUpdate();
	    }catch (ClassNotFoundException e) {
	    	e.printStackTrace();
	    }catch (Exception e1) {
	    	e1.printStackTrace();
	    }
				       
		
	}
		
	}





