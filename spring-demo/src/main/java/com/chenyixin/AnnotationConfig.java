package com.chenyixin;


import com.chenyixin.bean.MyTestBean;
import com.chenyixin.bean.Say;
import com.chenyixin.bean.TestA;
import com.chenyixin.bean.TestC;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.chenyixin")
@EnableAspectJAutoProxy
public class AnnotationConfig {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AnnotationConfig.class);
//		UserDao userDao=(UserDao) ac.getBean(UserDao.class);
//		userDao.printInfo();
//
//
//		BeanFactory bf = new ClassPathXmlApplicationContext("spring-config.xml");
//		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
//		System.out.println(myTestBean.getName());

//
		Say testA = (Say) ac.getBean("testC");
		testA.say();


	}


}
