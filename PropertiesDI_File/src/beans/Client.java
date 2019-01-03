package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		Test test = (Test) context.getBean("t");
	
		test.printData();
	}
}
