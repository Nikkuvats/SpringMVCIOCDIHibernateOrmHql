package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	
	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee(111, "Aayush", "abc@gmail.com", 500);
		Employee e2 = new Employee(222, "Anant", "abc@gmail.com", 600);
		Employee e3 = new Employee(333, "Vinay", "abc@gmail.com", 700);
		Employee e4 = new Employee(444, "Shivam", "abc@gmail.com", 800);
		
		session.update(e1);
		session.merge(e2);
		session.save(e3);
		session.saveOrUpdate(e4);
				
		transaction.commit(); 
		session.close();
	}
}
