package by.tr.conspect.bean;

public class User {
	private String name;
	private String pass;
	private int yearBirthday;
	
	public User(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearBirthday() {
		return yearBirthday;
	}

	public void setYearBirthday(int yearBirthday) {
		this.yearBirthday = yearBirthday;
	}
	
	public String getPassword() {
		return pass;
	}

	public void setPassword(String password) {
		this.pass = pass;
	}
}
