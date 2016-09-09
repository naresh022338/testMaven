package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut(value= "execution(* com.psl.aop.Performer.perform(..))")
	public void dummy(){			//dummy becomed id of pointcut
		
	}
	
	@Before(value = "dummy()")
	public void audienceTakesSeats(){
		System.out.println("audienceTakesSeats");
	}
	public void switchOffPhones(){
		System.out.println("switchOffPhones");
	}
	public void demandRefund(){
		System.out.println("demanding Refund");
	}
	public void applaud(){
		System.out.println("clap clap clap!!!");
	}
	public void goHome(){
		System.out.println("Audience go Homes");
	}
	
	public void watchPerformance(ProceedingJoinPoint jp){
		System.out.println("audienceTakesSeats");
		System.out.println("switchOffPhones");
		
		//start stopwatch
		try {
			jp.proceed();
		} catch (Throwable e) {
			System.out.println("demanding Refund");
		}//give control to point-cut method
		//stop stopWatch
		
		System.out.println("clap clap clap!!!");
		System.out.println("Audience go Homes");


	}
}
