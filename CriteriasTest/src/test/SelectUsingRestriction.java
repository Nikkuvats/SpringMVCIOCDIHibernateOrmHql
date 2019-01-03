package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class SelectUsingRestriction {
	
	/*public static void main(String[] args) {
	
		System.out.println("SelectUsingRestriction");
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");

		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Criteria c = session.createCriteria(Employee.class);
		
		// for conditions Where =,>,<,between like
	
		Criterion cr = 	Restrictions.eq("id", 111);
		c.add(cr);
		Employee e =(Employee)c.uniqueResult();
		System.out.println(e.getName()+ " " +e.getEmail() + " " + e.getSalary());
		
		
		Criterion cr = Restrictions.gt("salary", 500);
		c.add(cr);
		List<Employee> eList = c.list();
		for (Employee employee : eList) {
		System.out.println(employee.getName()+ " " +employee.getEmail() + " " + employee.getSalary());
		}
		
		Criterion cr = Restrictions.lt("salary",700);
		c.add(cr);
		List<Employee> eList = c.list();
		for (Employee employee : eList) {
		System.out.println(employee.getName()+ " " +employee.getEmail() + " " + employee.getSalary());
		
		Criterion cr = Restrictions.lt("salary",700);
		c.add(cr);
		List<Employee> eList = c.list();
		for (Employee employee : eList) {
		System.out.println(employee.getName()+ " " +employee.getEmail() + " " + employee.getSalary());
		
		}
	}*/
}