package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class SelectAll {

	public static void main(String[] args) {

		System.out.println("SelectAll");
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");

		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();

		Criteria c = session.createCriteria(Employee.class);
		List<Employee> list = c.list();
		for (Employee employee : list) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getEmail() + " "
					+ employee.getSalary());
		}
		
		/*Criterion cr = Restrictions.between("salary", 500, 800);
		c.add(cr);
		List<Employee> emList = c.list();
		for (Employee employee : emList) {
			System.out.println(employee.getSalary());
		}*/
	}
}