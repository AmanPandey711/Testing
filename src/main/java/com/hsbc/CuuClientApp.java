package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CuuClientApp {

	public static void main(String[] args) {
//		CurrencyConverter cc = new CurrencyConverter();
//		cc.setExchrate(74.45);
//		System.out.println(cc.dollarToRs(1000));
//		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanconfig.xml");
		CurrencyConverter ccobj = ctx.getBean("currencyConverter",CurrencyConverter.class);
		//ccobj.setExchrate(76.89);
		System.out.println(ccobj.dollarToRs(100));
		
	}
}
//maven and gradle do same thing but they are different tools
/*
 * Build tools: Maven and Gradle
 * when we build a project we need to do a lot of things like dependency files testing and documentation so 
 * build tool it can documentation 
 * but we dont have much time so we will see maven as dependency management tool
 * we can use maven do develop any type of project it gives ready to us eproject type
 * it gives us archetype...archetype is basically model of a project like ejb/hibernate/quickstart
 * archetype-- readymade skeleton structure for any type of project so we can just put files in structure
 * we will use maven to build the project 
 * POM: Project object Model it is basically a xml file it simply contains configuration of entire project,
 * pom is heart of every maven project
 * the project we created have a name but it artifact 
 * version-snapshot
 * every pom has G A V: group id Artifact version: these things identify our project uniquely among all possible maven project
 * dependency management tool: we have transitive dependency tools ... we only tell maven what files we need and maven gets them
 * and it in build path.. we only tell what we want not how to get it
 */
