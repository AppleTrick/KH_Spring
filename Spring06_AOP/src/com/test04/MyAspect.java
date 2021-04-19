package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(public * * (..))")
	public void before(JoinPoint join) {
		System.out.println("출석한다.");
	}
	@After("execution(public * * (..))")
	public void after(JoinPoint join) {
		System.out.println("집에간다.");
	}
	
	
	// 성공적으로 실행이 됬을때 반환
	@AfterReturning(pointcut = "execution(public * * (..))", returning = "returnVal")
	public void returning(JoinPoint join, Object returnVal) {
		System.out.println(returnVal + " 열심히 하는 날이었다.");
	}
	
	
	// 오류가 나와 에러가 발생했을때
	@AfterThrowing("execution(public * * (..))")
	public void throwing(JoinPoint join) {
		System.out.println("쉬는날 이었다...");
	}
}
