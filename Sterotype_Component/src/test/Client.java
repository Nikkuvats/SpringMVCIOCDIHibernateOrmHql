package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ds.cab.car.Car;

public class Client {
	
	public static void main(String[] args) {
	
		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
		Car c = (Car)ap.getBean(Car.class);
		
		c.printdata();
	}
}
