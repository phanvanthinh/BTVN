package dao;

import java.util.List;

import model.Orderr;


public interface OrderDao {
	public List<Orderr> findAll(); 
	public void  addOrder(Orderr order);
                
}
