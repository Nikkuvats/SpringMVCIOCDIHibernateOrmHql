package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Admin;
import beans.HEmployee;
import beans.SEmployee;

public class Client {
	
	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		SEmployee sEmployee = new SEmployee(111, "abc", "abc@gmail.com", 500,"hibernate");
		HEmployee hEmployee = new HEmployee(222, "lmn", "lmn@gmail.com", 600,10);
		Admin admin = new Admin(333, "aaa", "aaa@gmail.com", 700, "SRNAGAR");
		
		session.save(sEmployee);
		session.save(hEmployee);
		session.save(admin);
		transaction.commit();
		session.close();
		sFactory.close();
	}
}
