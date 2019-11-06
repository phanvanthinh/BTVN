package msita.spring.demo.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import msita.spring.demo.model.User1;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public User1 getUserByUsername(String username) {
		Criteria cr = getCurrentSession().createCriteria(User1.class);
		cr.add(Restrictions.eq("username", username));
		
		User1 user = (User1) cr.list().get(0);
		
	
	
		
		return user;
	}


	

	

}
