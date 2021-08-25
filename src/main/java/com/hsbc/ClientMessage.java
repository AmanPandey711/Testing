package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMessage {

	public static void main(String[] args) {
		
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beanconfig.xml");
	Message msgobj = ctx.getBean("msg", Message.class);
	//ccobj.setExchrate(76.89);
	System.out.println(msgobj);
}
}