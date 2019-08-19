package msita.jspservlet.phanvanthinh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import msita.jspservlet.phanvanthinh.jdbc.ConnectionUtils;
import msita.jspservlet.phanvanthinh.model.Orderr;

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
				order.setId(rs.getInt("id"));
				order.setCustomerName(rs.getString("customer_name"));
				order.setPhoneNumber(rs.getInt("phone_number"));
				order.setAddress(rs.getString("address"));
				order.setStatus(rs.getString("status"));
				order.setTotal(rs.getInt("total"));
				order.setProductId(rs.getInt("product_id"));
				listOrder.add(order);
				
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (cnn != null) {
					cnn.close();
			   }if (pr != null) {
				   pr.close();
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
				return null;
			}
		}
		return listOrder;
	}

	@Override
	public void addOrder(Orderr order) {
		String sql = "insert into orderr(customer_name, phone_number, address,total, product_id) values ('"+order.getCustomerName()+"', "+order.getPhoneNumber()+", '"+order.getAddress()+"',"+order.getTotal()+", "+order.getProductId()+");";
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
	    }finally {
			try {
				if (cnn != null) {
					cnn.close();
			   }if (pr != null) {
				   pr.close();
			   }
			}catch (Exception e) {
			 e.printStackTrace();
			}
		}
				       
		
	}

	@Override
	public List<Orderr> findOrderByStatusByCreate() {
		List<Orderr> listOrder1 = new ArrayList<Orderr>();
		String sql=" select *from orderr where status ='Create'";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		try { 
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			rs = pr.executeQuery();
			while(rs.next()) {
				Orderr order = new Orderr();
				order.setId(rs.getInt("id"));
				order.setCustomerName(rs.getString("customer_name"));
				order.setAddress(rs.getString("address"));
				order.setPhoneNumber(rs.getInt("phone_number"));
				order.setStatus(rs.getString("status"));
				order.setTotal(rs.getInt("total"));
				order.setProductId(rs.getInt("product_id"));
				listOrder1.add(order);

			}
					
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e ) {
			e.printStackTrace();
		}finally {
			try {
				if (cnn != null) {
					cnn.close();
			   }if (pr != null) {
				   pr.close();
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
				return null;
			}
		} 
		
		return listOrder1;
	}

	@Override
	public List<Orderr> findOrderByStatusBySuccess() {
		List<Orderr> listOrder1 = new ArrayList<Orderr>();
		String sql=" select *from orderr where status ='Success'";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		try { 
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			rs = pr.executeQuery();
			while(rs.next()) {
				Orderr order = new Orderr();
				order.setId(rs.getInt("id"));
				order.setCustomerName(rs.getString("customer_name"));
				order.setAddress(rs.getString("address"));
				order.setPhoneNumber(rs.getInt("phone_number"));
				order.setStatus(rs.getString("status"));
				order.setTotal(rs.getInt("total"));
				order.setProductId(rs.getInt("product_id"));
				listOrder1.add(order);

			}
					
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e ) {
			e.printStackTrace();
		} finally {
			try {
				if (cnn != null) {
					cnn.close();
			   }if (pr != null) {
				   pr.close();
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
				return null;
			}
		}
		
		return listOrder1;
		
	}

	@Override
	public void editOrder(Orderr order) {
		String sql = "update orderr set status ='"+order.getStatus()+"' where id = "+order.getId()+" ";
		Connection cnn = null;
		PreparedStatement pr = null;
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			pr.executeUpdate();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (cnn != null) {
					cnn.close();
			   }if (pr != null) {
				   pr.close();
			   }
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Orderr findOrderById(int id) {
		List<Orderr> listOrder = new ArrayList<Orderr>();
		String sql = "select *from orderr where id = "+id+"";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				Orderr order = new Orderr();
				order.setId(rs.getInt("id"));
				order.setCustomerName(rs.getString("customer_name"));
				order.setAddress(rs.getString("address"));
				order.setPhoneNumber(rs.getInt("phone_number"));
				order.setStatus(rs.getString("status"));
				order.setTotal(rs.getInt("total"));
				order.setProductId(rs.getInt("product_id"));
				listOrder.add(order);
			}
		}catch ( Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (cnn != null) {
					cnn.close();
			   }if (pr != null) {
				   pr.close();
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
			   e.printStackTrace();
			}
		}if (listOrder != null & !listOrder.isEmpty()) {
			return listOrder.get(0);
		} 
		return null;
	}

	@Override
	public void setStatusSuccess(int id) {
		String sql="update orderr set status='Success' where id="+id+"";
		Connection cnn = null;
		PreparedStatement pr = null;
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			pr.executeUpdate();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (cnn != null) {
					cnn.close();
			   }if (pr != null) {
				   pr.close();
			   }
			}catch (Exception e) {
			   e.printStackTrace();
			}
		}
		
	}

	@Override
	public List<Orderr> findOrderByStatusByCancel() {
		List<Orderr> listOrder1 = new ArrayList<Orderr>();
		String sql=" select *from orderr where status ='Cancel'";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		try { 
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			rs = pr.executeQuery();
			while(rs.next()) {
				Orderr order = new Orderr();
				order.setId(rs.getInt("id"));
				order.setCustomerName(rs.getString("customer_name"));
				order.setAddress(rs.getString("address"));
				order.setPhoneNumber(rs.getInt("phone_number"));
				order.setStatus(rs.getString("status"));
				order.setTotal(rs.getInt("total"));
				order.setProductId(rs.getInt("product_id"));
				listOrder1.add(order);

			}
					
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e ) {
			e.printStackTrace();
		}finally {
			try {
				if (cnn != null) {
					cnn.close();
			   }if (pr != null) {
				   pr.close();
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
			   e.printStackTrace();
			}
		} 
		
		return listOrder1;
	}

	@Override
	public void setStatusCancel(int id) {
		String sql="update orderr set status='Cancel' where id="+id+"";
		Connection cnn = null;
		PreparedStatement pr = null;
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			pr.executeUpdate();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (cnn != null) {
					cnn.close();
			   }if (pr != null) {
				   pr.close();
			   }
			}catch (Exception e) {
			   e.printStackTrace();
			}
		}
		
	}
		
	}





