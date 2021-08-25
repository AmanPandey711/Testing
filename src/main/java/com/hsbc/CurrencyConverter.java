package com.hsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//@PropertySource("classpath:value.properties")
public class CurrencyConverter implements CurrConvIntf{
	
	 //can be set either against variable or setter or constructor
	ExchangeService exchangeService;
	
	@Value("99.0")
	double exchrate;
//	
//	
//	
//	public CurrencyConverter(double exchrate) {
//		super();
//		this.exchrate = exchrate;
//	}
//
//
//
//	public double getExchrate() {
//		return exchrate;
//	}
//
//
//
//	public void setExchrate(double exchrate) {
//		this.exchrate = exchrate;
//	}
//


	
	public ExchangeService getExchangeService() {
		return exchangeService;
	}


	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}


	public double dollarToRs(int amt) {
		// TODO Auto-generated method stub
		
		return amt*exchangeService.getRate();
	}
	
	
		
}
