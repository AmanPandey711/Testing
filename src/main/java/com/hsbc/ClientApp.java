package com.hsbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;




public class ClientApp {

	public static void main(String[] args) {
//		HelloWorld object = new HelloWorld();
//	//	object.sayHello();
//		//container should instantiate the bean but we are not using spring right now
//		//developers dont use new in spring
//		//3 ways of configuring beans
//		
//		Resource res = new ClassPathResource("beanconfig.xml");
//		BeanFactory factory = new XmlBeanFactory(res);
//		//beanfactory is my spring container here. it go to search bean then instantiates it and return it
//		HelloWorld hwobj = factory.getBean("hw", HelloWorld.class);
//		//beanfactory is interface 
		//application context is subinterface of beanfactory and now we use this thus it is container as well
		//beanfactory--> container
		//application context --> make it framework
//		hwobj.sayHello();
//	frameworks have very high 
//	ApplicationContext ctx = new ClassPathXmlApplicationContext("beanconfig.xml");	
//	HelloWorld obj = ctx.getBean("hw",HelloWorld.class);
//	obj.sayHello();
		//now we use java configuration so method changed
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		HelloWorld helloWorld = ctx.getBean("hello",HelloWorld.class);
		User u = ctx.getBean("usered", User.class);
		CurrencyConverter tc = ctx.getBean("cc", CurrencyConverter.class);
		System.out.println(tc.dollarToRs(100));
		System.out.println(u);
		helloWorld.sayHello();
	}
}//We can use any configuration so we can use configuration combination as well

//we put configuration in xml file. 