package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionUtils;
import model.Product;

public class ProductDaoImpl extends ConnectionUtils implements ProductDao{

	@Override
	public List<Product> findAll() {
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		List<Product> listProducts = new ArrayList<Product>();
		String sql = "select *from product; ";
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			rs = pr.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("Id"));
				product.setDogName(rs.getString("Dog_Name"));
				product.setGender(rs.getString("Gender"));
				product.setAge(rs.getString("Age"));
				product.setHealth(rs.getString("Health"));
				product.setPrice(rs.getInt("Price"));
				product.setStatus(rs.getString("Status"));
				product.setAvatar(rs.getString("Avatar"));
				listProducts.add(product);
				
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch (Exception e){
		
			e.printStackTrace();
			
		}
		return listProducts;
	}

	@Override
	public void addProduct(Product product) {
	      String sql ="insert into product (Dog_Name, Gender, Age, Health, Price, Status, Avatar) values ('"+product.getDogName()+"','"+product.getGender()+"', '"+product.getAge()+"', '"+product.getHealth()+"', "+product.getPrice()+", '"+product.getStatus()+"','"+product.getAvatar()+"');";
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
		  }
	}

	@Override
	public void editProduct(Product product) {
		String sql = "update product SET Dog_Name = '"+product.getDogName()+"', Gender ='"+product.getGender()+"', Age = '"+product.getAge()+"', Health = '"+product.getHealth()+"', Price= "+product.getPrice()+", Status = '"+product.getStatus()+"', Avatar='"+product.getAvatar()+"' Where Id ="+product.getId()+"";
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
		}
	}

	@Override
	public void deleteProduct(int id) {
		String sql = " Delete from product where Id = "+id+";";
		Connection cnn = null;
		PreparedStatement pr = null;
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			pr.executeUpdate(sql);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Product findProductById(int id) {
		List<Product> listProduct = new ArrayList<Product>();
		String sql = " select *from product where Id = "+id+"";
		Connection cnn = null;
		PreparedStatement pr = null;
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			ResultSet rs = pr.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("Id"));
				product.setDogName(rs.getString("Dog_Name"));
				product.setGender(rs.getString("Gender"));
				product.setAge(rs.getString("Age"));
				product.setHealth(rs.getString("Health"));
				product.setPrice(rs.getInt("Price"));
				product.setStatus(rs.getString("Status"));
				product.setAvatar(rs.getString("Avatar"));
				listProduct.add(product);
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}if (listProduct != null & !listProduct.isEmpty()) {
			return listProduct.get(0);
		}
		return null;
	}

}
