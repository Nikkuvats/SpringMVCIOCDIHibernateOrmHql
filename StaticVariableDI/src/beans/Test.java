package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory ap = new XmlBeanFactory(new ClassPathResource("resources/spring.xml"));
		Car c = (Car) ap.getBean("c");
		
		c.printdata();
	}
}
