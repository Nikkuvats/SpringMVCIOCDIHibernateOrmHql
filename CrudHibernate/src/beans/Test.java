package beans;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Test {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.conf.xml");
		
		SessionFactory seFactory = cfg.buildSessionFactory();
		Session session = seFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		// create class Student
		
		Student st = new Student();
		st.setId(125);
		st.setName("Vinay");
		
		int pk = (Integer)session.save(st);
		System.out.println(pk);
		
		//session.save(st);
		//session.persist(st);
		
		//session.saveOrUpdate(st);
		//session.update(st);
		
		session.merge(st);
		
		// save can execute without transaction boundries
		// persist can execute with transaction boundries
		
		transaction.commit();
		session.clear();
		seFactory.close();
		System.out.println("data insertion successfully");
	}
}