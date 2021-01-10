package com.chenyixin.bean;

import org.springframework.stereotype.Component;

@Component
public class TestC implements Say{


	public void say(){
		System.out.println("say hello");
	}
}
