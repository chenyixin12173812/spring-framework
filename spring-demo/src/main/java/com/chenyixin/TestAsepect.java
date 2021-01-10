package com.chenyixin;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class TestAsepect {
    @Pointcut("execution(* com.chenyixin.*..say())")
	void  getPoint() {
	}

	@Before("(getPoint())")
	@Order(1)
	public void doBefore() {
		System.out.println("doBefore");
	}
	@Before("(getPoint())")
	@Order(5)
	public void doB3efore() {
		System.out.println("doB3efore");
	}
    @After("(getPoint())")
	public void doAfter() {
		System.out.println("doAfter");
	}
}
