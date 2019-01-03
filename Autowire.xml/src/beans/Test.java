package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
		Car car = (Car) context.getBean("c");
		
		car.printdata();
	}
}
