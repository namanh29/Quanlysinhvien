package entity;

public class Student {
	private int id;
	private String fullname, gender, email, phone_number;
	private int age;
	
	
	public Student(int id, String fullname, String gender, String email, String phone_number, int age) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.email = email;
		this.phone_number = phone_number;
		this.age = age;
	}

	public Student(String fullname, String gender, String email, String phone_number, int age) {
		super();
		this.fullname = fullname;
		this.gender = gender;
		this.email = email;
		this.phone_number = phone_number;
		this.age = age;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	
}
