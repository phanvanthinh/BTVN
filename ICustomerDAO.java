package jsp.connectionUtils;

import com.mysql.cj.xdevapi.Statement;

public interface ICustomerDAO {

	public void addCustomer();
	public void deleteCustomerByName(String s);
	public void findCustomerByName(String s);
	public void getCustomer();
	public void updateCustomerByName(String s);
}
