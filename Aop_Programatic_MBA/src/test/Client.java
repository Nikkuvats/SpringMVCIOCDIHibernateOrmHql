package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import service.LogBeforService;

public class Client {
	
	public static void main(String[] args) {
		
	
		Bank b = new Bank();
		LogBeforService lbs = new LogBeforService();
		
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		
		pfb.addAdvice(lbs);
		
		Bank bproxy = (Bank) pfb.getObject();
		int amount = bproxy.deposit("sbi123", 5000);
		System.out.println(amount);
	}
}