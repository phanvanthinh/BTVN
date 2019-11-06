package msita.spring.demo.dao;

import java.util.List;

import msita.spring.demo.model.Product;

public interface ProductDao {
	public List<Product> getProduct();
	public void createProduct(Product product);
	public Product findProductById(int id);
//	public void deleteProduct(Product product);
	public void deleteProduct(int id);
	public void updateProduct(Product product);
	public List<Product> findProductByUsername(String dogBreed);
	
	
}
