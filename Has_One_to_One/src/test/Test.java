package test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Vote;
import beans.Voter;

public class Test {
	
	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		
		Voter v = new Voter();
		v.setVid(111);
		v.setVname("abc");
		v.setVage(25);
		
		Vote vt1 = new Vote();
		vt1.setPname("bdp");
		vt1.setCdate(new Date());
		vt1.setVoter(v);
		
		Vote vt2 = new Vote();
		vt2.setPname("bdp");
		vt2.setCdate(new Date());
		vt2.setVoter(v);
		
		session.save(v);
		session.save(vt1);
		session.save(vt2);
		session.beginTransaction().commit();
		session.close();
	}
} 