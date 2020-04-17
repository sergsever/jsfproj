package com.lvov.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ExampleBean {
	private String name = "Сергей";

	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
}
