package dao;

import java.util.List;

import model.Product;

public interface ProductDao {
       public List<Product> findAll() ; 
       public Product findProductById(int id);
       public void addProduct(Product product);
       public void editProduct(Product product);
       public void deleteProduct(int id);
}
