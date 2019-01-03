package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Test {
	
	public static void main(String[] args) {
		
		Student st = new Student();
		st.setId(111);
		st.setName("abc");
		st.setEmail("abc@gmail.com");
		st.setAddress("Noida");
		
		// Student object state is transiant
		
		Configuration cfg = new Configuration();
		cfg.configure("resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		s.save(st);
		
		// Student object state is persistant
		s.beginTransaction().commit();
		// Student object will move to database
		s.evict(st);
		// Student object will remove from persistant
		// Now gc can collect your student object 
	}
}