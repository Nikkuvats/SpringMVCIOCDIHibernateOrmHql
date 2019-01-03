package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Test test = (Test) ap.getBean("t");
		
		test.printConn();
	}
}
