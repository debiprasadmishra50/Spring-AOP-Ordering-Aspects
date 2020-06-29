package demo.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 1)
public class MyDemoLoggingAspect {
	
	// this is where we add all of our related advice for logging
	
	// @Before annotation, execute this before executing that
	@Before("execution(public void addAccount())") // point-cut expression
	public void beforeAddAccount() {
		System.out.println("\n=====>>> Executing @Before Advice |beforeAddAccount| on addAccount()\n");
	}
}
