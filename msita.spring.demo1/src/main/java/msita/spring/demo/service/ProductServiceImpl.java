package msita.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import msita.spring.demo.dao.ProductDao;
import msita.spring.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	public List<Product> getProduct() {

		return productDao.getProduct();
	}

	public void createProduct(Product product) {
		product.setStatus("Create");
		productDao.createProduct(product);

	}

	public Product findProductById(int id) {

		return productDao.findProductById(id);
	}


	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
//		Product product = productDao.findProductById(id);
////		if(product != null) {
////			productDao.deleteProduct(product);
////		}
		
	}

	public void updateProduct(Product product) {
		productDao.updateProduct(product);
		
	}

	public List<Product> findProductByUsername(String dogBreed) {
		return productDao.findProductByUsername(dogBreed);
	}

}
