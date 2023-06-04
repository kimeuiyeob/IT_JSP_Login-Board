package com.special.app.vo;

public class NameVO {
	private String name;
	
	public NameVO() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NameVO [name=" + name + "]";
	}
}
