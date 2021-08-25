package com.hsbc;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
//<bean id="b1" class="com.hsbc.HelloWorld" />
	
	@Bean//Important method name is bean id or we can set like @Bean(name="fff")
	public HelloWorld hello() {
		return new HelloWorld();
	}
	
	@Bean(name="usered")
	public User user() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		User user = new User();
		user.setUname(sc.next());
		return user;
	}
	@Bean
	public CurrencyConverter cc() {
		CurrencyConverter cc1 = new CurrencyConverter();
		cc1.setExchangeService(es());
		return cc1;
	}
	@Bean
	public ExchangeService es() {
		return new ExchangeService();
	}
	
}
