package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookClient {
	public static void main(String[] args) {
		
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beanconfig.xml");
	Book bobj = ctx.getBean("book",Book.class);
	System.out.println(bobj);
	
}
}
//inversion of control is based on principle from hollywood: "Dont call me I will call you"
// the beanfactory gives us IoC framework
//appContext comes frombeanfactory so we get ToC