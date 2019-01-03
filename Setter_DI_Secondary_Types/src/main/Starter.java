package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Starter {
	
	public static void main(String[] args) {
		
	//	String files[] = new String[] {"resources/car.xml","resources/engine.xml"};
		
		String files2[] = new String[]{"resources/car-engine.xml"};
		
		ApplicationContext context=new ClassPathXmlApplicationContext(files2);  
		
		Car car = (Car) context.getBean("c");
		
		car.cardata();
	}
}
