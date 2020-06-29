package demo.spring.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.spring.aopdemo.dao.AccountDAO;

public class MainApplicationApp {
	
	public static void main(String[] args) {
		
		// read the spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// get the bean from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// call the business method
		accountDAO.addAccount();
		
		// calling it again
		System.out.println("\nCalling the method again\n");
		accountDAO.addAccount();
		
		// close the context
		context.close();
	}
}
