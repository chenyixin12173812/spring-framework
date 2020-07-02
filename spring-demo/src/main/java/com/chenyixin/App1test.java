package com.chenyixin;

import com.chenyixin.bean.MyTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1test {


	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
//		UserDao userDao=(UserDao) ac.getBean(UserDao.class);
//		userDao.printInfo();
//
//
//		BeanFactory bf = new ClassPathXmlApplicationContext("spring-config.xml");
//		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
//		System.out.println(myTestBean.getName());

		System.out.println(ac.getBean(MyTestBean.class));


	}




}
