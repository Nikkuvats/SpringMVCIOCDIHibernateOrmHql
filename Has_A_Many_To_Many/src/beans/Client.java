package beans;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	
	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session s = sFactory.openSession();
		
		Transaction t = s.beginTransaction();
		
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("scjp");
		c1.setFee(2000);
		
		Course c2 = new Course();
		c1.setCid(2);
		c1.setCname("struts");
		c1.setFee(1500);
		
		Course c3 = new Course();
		c3.setCid(3);
		c3.setCname("spring");
		c3.setFee(1500);
		
		Course c4 = new Course();
		c4.setCid(4);
		c4.setCname("hibernate");
		c4.setFee(1500);
		
		Set<Course> cSet = new HashSet<Course>();
		cSet.add(c1);
		cSet.add(c2);
		
		Set<Course> cSet1 = new HashSet<Course>();
		cSet1.add(c2);
		cSet1.add(c3);
		cSet1.add(c4);
		
		Faculty f1 = new Faculty();
		f1.setFid(1);
		f1.setFname("Durga");
		f1.setYearex(10);
		f1.setCourses(cSet);
		
		Faculty f2 = new Faculty();
		f2.setFid(2);
		f2.setFname("Srikanth");
		f2.setYearex(5);
		f2.setCourses(cSet);
		
		Faculty f3 = new Faculty();
		f1.setFid(3);
		f1.setFname("Naveeen");
		f1.setYearex(4);
		f1.setCourses(cSet1);
		
		s.saveOrUpdate(f1);
		s.saveOrUpdate(f2);
		s.saveOrUpdate(f3);
		s.saveOrUpdate(c1);
		s.saveOrUpdate(c2);
		s.saveOrUpdate(c3);
		s.saveOrUpdate(c4);
		t.commit();
	}
}
