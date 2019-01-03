package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		   ApplicationContext ap = new  ClassPathXmlApplicationContext("resource/spring.xml");
		   Car car = (Car) ap.getBean("c");
		   car.printdata();

		// ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring_constructor.xml");

		// Bus bus = (Bus) ap.getBean("b");

		// bus.printdata();
		
		//	ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring_autodetect.xml");

		//  Bus bus = (Bus) ap.getBean("b");

		//	bus.printdata();
	}
}
