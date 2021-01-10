package com.chenyixin.bean;

import org.springframework.stereotype.Service;

@Service
public class MyTestBean extends TestAbstract{
	private String name = "ChenHao";



	public MyTestBean() {
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}' +super.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
