package com.chenyixin.bean;

import org.springframework.stereotype.Service;

@Service
public class MyTestBean {
	private String name = "ChenHao";



	public MyTestBean() {
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
