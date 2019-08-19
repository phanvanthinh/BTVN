package msita.jspservlet.phanvanthinh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import msita.jspservlet.phanvanthinh.jdbc.ConnectionUtils;
import msita.jspservlet.phanvanthinh.model.Product;

public class ProductDaoImpl extends ConnectionUtils implements ProductDao{

	@Override
	public List<Product> findAll() {
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		List<Product> listProducts = new ArrayList<Product>();
		String sql = "select *from product ; ";
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			rs = pr.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("Id"));
				product.setDogBreed(rs.getString("dog_breed"));
				product.setGender(rs.getString("gender"));
				product.setAge(rs.getString("age"));
				product.setPrice(rs.getInt("price"));
				product.setStatus(rs.getString("status"));
				product.setAvatar(rs.getString("avatar"));
				listProducts.add(product);
				
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}catch (Exception e){
		
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
		return listProducts;
	}

	@Override
	public void addProduct(Product product) {
	      String sql ="insert into product (dog_breed, gender, age, price, avatar) values ('"+product.getDogBreed()+"','"+product.getGender()+"', '"+product.getAge()+"', "+product.getPrice()+", '"+product.getAvatar()+"')";
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
	public void editProduct(Product product) {
		String sql = "update product SET dog_breed = '"+product.getDogBreed()+"', gender ='"+product.getGender()+"', age = '"+product.getAge()+"', price= "+product.getPrice()+", status = '"+product.getStatus()+"', avatar='"+product.getAvatar()+"' Where id ="+product.getId()+"";
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
	public void deleteProduct(int id) {
		String sql = " Delete from product where id = "+id+";";
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
	public Product findProductById(int id) {
		List<Product> listProduct = new ArrayList<Product>();
		String sql = " select *from product where Id = "+id+"";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			rs = pr.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("Id"));
				product.setDogBreed(rs.getString("dog_breed"));
				product.setGender(rs.getString("gender"));
				product.setAge(rs.getString("age"));
				product.setPrice(rs.getInt("price"));
				product.setStatus(rs.getString("status"));
				product.setAvatar(rs.getString("avatar"));
				listProduct.add(product);
			}
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
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
			   e.printStackTrace();
			}
		} if (listProduct != null & !listProduct.isEmpty()) {
			return listProduct.get(0);
		}
		return null;
	}

	@Override
	public void setStatusSold(int id) {
		String sql="update product set status='Sold' where id="+id+"";
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
	public List<Product> findProductByStatusByAvailable() {
		List<Product> listProduct = new ArrayList<Product>();
		String sql ="select *from product where status='Available'";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		try {
			cnn = super.getMyConnection();
			pr=cnn.prepareStatement(sql);
			rs=pr.executeQuery();
			
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("Id"));
				product.setDogBreed(rs.getString("dog_breed"));
				product.setGender(rs.getString("gender"));
				product.setAge(rs.getString("age"));
				product.setPrice(rs.getInt("price"));
				product.setStatus(rs.getString("status"));
				product.setAvatar(rs.getString("avatar"));
				listProduct.add(product);
			}
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
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
			   e.printStackTrace();
			}
		} 
		
		return listProduct;
	}

	@Override
	public List<Product> findProductByStatusBySold() {
		List<Product> listProduct = new ArrayList<Product>();
		String sql ="select *from product where status='Sold'";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		try {
			cnn = super.getMyConnection();
			pr=cnn.prepareStatement(sql);
			rs=pr.executeQuery();
			
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("Id"));
				product.setDogBreed(rs.getString("dog_breed"));
				product.setGender(rs.getString("gender"));
				product.setAge(rs.getString("age"));
				product.setPrice(rs.getInt("price"));
				product.setStatus(rs.getString("status"));
				product.setAvatar(rs.getString("avatar"));
				listProduct.add(product);
			}
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
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
			   e.printStackTrace();
			}
		} 
		
		return listProduct;
	}

	@Override
	public void setStatusAvailable(int id) {
		String sql="update product set status='Available' where id="+id+"";
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
	public void setStatusError(int id) {
		String sql="update product set status='Error' where id="+id+"";
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
	public List<Product> findProductByStatusByError() {
		List<Product> listProduct = new ArrayList<Product>();
		String sql ="select *from product where status='Error'";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		try {
			cnn = super.getMyConnection();
			pr=cnn.prepareStatement(sql);
			rs=pr.executeQuery();
			
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("Id"));
				product.setDogBreed(rs.getString("dog_breed"));
				product.setGender(rs.getString("gender"));
				product.setAge(rs.getString("age"));
				product.setPrice(rs.getInt("price"));
				product.setStatus(rs.getString("status"));
				product.setAvatar(rs.getString("avatar"));
				listProduct.add(product);
			}
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
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
			   e.printStackTrace();
			}
		} 
		
		return listProduct;
	}

	@Override
	public List<Product> findProductByDogBreed(String dogBreed) {
		List<Product> listProduct = new ArrayList<Product>();
		String sql = " select *from product where dog_breed = '"+dogBreed+"'";
		Connection cnn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		try {
			cnn = super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			rs = pr.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("Id"));
				product.setDogBreed(rs.getString("dog_breed"));
				product.setGender(rs.getString("gender"));
				product.setAge(rs.getString("age"));
				product.setPrice(rs.getInt("price"));
				product.setStatus(rs.getString("status"));
				product.setAvatar(rs.getString("avatar"));
				listProduct.add(product);
		  }
			
		
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
			   }if (rs != null) {
				   rs.close();
			   }
			}catch (Exception e) {
			   e.printStackTrace();
			}
		} 
     return listProduct;
  }
}