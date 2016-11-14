package com.jensen.util;


public class User{
	
	
	
	private String name;
	private String email;
	private int id;
	
	public User(String name, String email, int id){
		this.name=name;
		this.id=id;
		this.email=email;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString(){
		return "Name="+this.name+", Email="+this.email;
	}
}