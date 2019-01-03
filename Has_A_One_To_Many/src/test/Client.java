package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movies;

public class Client {
	
	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Movies m1 = new Movies();
		m1.setMid(1);
		m1.setMoviesname("pk");
		
		Movies m2 = new Movies();
		m2.setMid(2);
		m2.setMoviesname("lagan");
	
		Set<Movies> set = new HashSet<Movies>();
		set.add(m1);
		set.add(m2); 
		
		Actor a = new Actor();
		a.setAid(1);
		a.setActorname("ameerkhan");
		a.setMovies(set);
		
		session.save(m1);
		session.save(m2);
		session.save(a);
		transaction.commit();

		System.out.println("insert successfully");
	}
}
