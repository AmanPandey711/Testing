package com.hsbc;

public class Author {
	String name;
	int age;
	String email;
	
	
	@Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	public Author(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
