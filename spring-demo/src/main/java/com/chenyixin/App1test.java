package com.chenyixin;

import com.chenyixin.bean.MyTestBean;
import com.chenyixin.bean.TestA;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableAspectJAutoProxy
public class App1test {


	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
//		UserDao userDao=(UserDao) ac.getBean(UserDao.class);
//		userDao.printInfo();
//
//
//		BeanFactory bf = new ClassPathXmlApplicationContext("spring-config.xml");
//		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
//		System.out.println(myTestBean.getName());

		System.out.println(ac.getBean("testA"));
//		TestAbstract testAbstract = (TestAbstract)ac.getBean("testAbstract");
//
//		System.out.println(testAbstract.toString());
		TestA testA = (TestA) ac.getBean("testA");
		testA.say();

		MyTestBean myTestBean = (MyTestBean)ac.getBean("myTestBean");

		System.out.println(testA.toString());
	}




}
