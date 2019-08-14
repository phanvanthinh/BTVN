package model;

public class Product {
      private int id;
      private String dogName;
      private String gender;
      private String age;
      private String health;
      private int price;
      private String status;
      private String avatar;
	public Product() {
		super();
	}
	public Product(int id, String dogName, String gender, String age, String health, int price, String status,
			String avatar) {
		super();
		this.id = id;
		this.dogName = dogName;
		this.gender = gender;
		this.age = age;
		this.health = health;
		this.price = price;
		this.status = status;
		this.avatar = avatar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
      
      
}
