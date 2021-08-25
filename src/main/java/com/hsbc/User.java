package com.hsbc;

public class User {

	String uname;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	@Override
	public String toString() {
		return "User [uname=" + uname + "]";
	}
	
}
