package model;

public class Orderr {
    private int id;
    private String customerName;
    private String gender;
    private int age;
    private int phoneNumber;
    private String address;
//    private float total;
    private String status;
	public Orderr() {
		super();
	}
	public Orderr(int id, String customerName, String gender, int age, int phoneNumber, String address,
			String status) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
//		this.total = total;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public float getTotal() {
//		return total;
//	}
//	public void setTotal(float total) {
//		this.total = total;
//	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
    
}
