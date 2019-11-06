package msita.spring.demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import msita.spring.demo.model.Product;

@Repository
@Transactional

public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public List<Product> getProduct() {
		Criteria cr = getCurrentSession().createCriteria(Product.class);
		return cr.list();
	}

	public void createProduct(Product product) {


		

	}

	public Product findProductById(int id) {
		Product product = (Product) getCurrentSession().get(Product.class, id);

		return product;
	}

//	public void deleteProduct(Product product) {
//		getCurrentSession().delete(product);
//
//	}
	public void deleteProduct(int id) {
		getCurrentSession().delete(id);

	}

	public void updateProduct(Product product) {
		getCurrentSession().update(product);

	}

	public List<Product> findProductByUsername(String dogBreed) {
		Criteria cr = getCurrentSession().createCriteria(Product.class);
		cr.add(Restrictions.eq("dogBreed", dogBreed));
		List<Product> listProduct = cr.list();
		return listProduct;
	}


}
