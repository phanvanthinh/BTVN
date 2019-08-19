package msita.jspservlet.phanvanthinh.model;

public class User {
       private int id ;
       private String userName;
       private String passwrod;
	public User() {
		super();
	}
	public User(int id, String userName, String passwrod) {
		super();
		this.id = id;
		this.userName = userName;
		this.passwrod = passwrod;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
       
       
}
