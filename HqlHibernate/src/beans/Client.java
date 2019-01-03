package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sFactory = configuration.buildSessionFactory();
		Session s = sFactory.openSession();
		
		Transaction transaction = s.beginTransaction();
		
		OldStudent oldStudent1 = new OldStudent(111, "Aayush", "Noida");
		OldStudent oldStudent2 = new OldStudent(112, "Anant", "UP");
		OldStudent oldStudent3 = new OldStudent(113, "Arpit", "Ghaziabad");
		
		s.save(oldStudent1);
		s.save(oldStudent2);
		s.save(oldStudent3);
		transaction.commit();
		sFactory.close();
	}
}
