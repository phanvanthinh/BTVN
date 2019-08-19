package msita.jspservlet.phanvanthinh.model;

public class Product {
      private int id;
      private String dogBreed;
      private String gender;
      private String age;
      private int price;
      private String status;
      private String avatar;
      
      
	public Product() {
		super();
	}


	public Product(int id, String dogBreed, String gender, String age, int price, String status, String avatar) {
		super();
		this.id = id;
		this.dogBreed = dogBreed;
		this.gender = gender;
		this.age = age;
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


	public String getDogBreed() {
		return dogBreed;
	}


	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
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
