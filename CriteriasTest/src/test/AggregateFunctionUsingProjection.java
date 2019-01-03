package test;

import java.util.Iterator;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import beans.Employee;

/*AVG – calculates the average of a set of values.
COUNT – counts rows in a specified table or view.
MIN – gets the minimum value in a set of values.
MAX – gets the maximum value in a set of values.
SUM – calculates the sum of values.*/


public class AggregateFunctionUsingProjection {

	/*public static void main(String[] args) {
		
		System.out.println("AggregateFunctionUsingProjection");
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
		
		Projection p = Projections.avg("salary");
		c.setProjection(p);
		double salary = (Double) c.uniqueResult();
		System.out.println(salary);
		
		Projection p = Projections.min("salary");
		c.setProjection(p);
		Employee salary = (Employee) c.uniqueResult();
		System.out.println(salary.getSalary());
		System.out.println(salary.getName());
		System.out.println(salary.getEmail());
		
		Projection p = Projections.min("salary");
		c.setProjection(p);
		int salary = (Integer) c.uniqueResult();
		System.out.println(salary);
		
		Projection p = Projections.sum("salary");
		c.setProjection(p);
		int salary = (Integer) c.uniqueResult();
		System.out.println(salary);
	}*/
}
