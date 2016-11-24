package com.jensen;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//OBS ska vara javax.faces.bean.ManagedBean som import!
@ManagedBean
@SessionScoped

public class NameWrapper {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}