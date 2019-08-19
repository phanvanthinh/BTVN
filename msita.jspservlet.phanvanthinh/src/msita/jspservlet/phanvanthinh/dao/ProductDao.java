package msita.jspservlet.phanvanthinh.dao;

import java.util.List;

import msita.jspservlet.phanvanthinh.model.Product;

public interface ProductDao {
       public List<Product> findAll() ; 
       public List<Product> findProductByStatusByAvailable();
       public List<Product> findProductByStatusBySold();
       public List<Product> findProductByStatusByError();
       public List<Product> findProductByDogBreed(String dogBreed);
       public Product findProductById(int id);
       public void addProduct(Product product);
       public void editProduct(Product product);
       public void deleteProduct(int id);
       void setStatusSold(int id);
       void setStatusAvailable(int id);
       void setStatusError(int id);
}
