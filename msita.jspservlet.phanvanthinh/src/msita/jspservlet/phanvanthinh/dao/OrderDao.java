package msita.jspservlet.phanvanthinh.dao;

import java.util.List;

import msita.jspservlet.phanvanthinh.model.Orderr;


public interface OrderDao {
	public List<Orderr> findAll(); 
	public void  addOrder(Orderr order);
    public List<Orderr> findOrderByStatusByCreate();   
    public List<Orderr> findOrderByStatusBySuccess();  
    public List<Orderr> findOrderByStatusByCancel();  
    public void editOrder(Orderr order);
    public Orderr findOrderById(int id);
    public void setStatusSuccess(int id);
    public void setStatusCancel(int id);
}
