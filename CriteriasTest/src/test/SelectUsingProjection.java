package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import beans.Employee;

public class SelectUsingProjection {

	/*public static void main(String[] args) {

		System.out.println("SelectUsingProjection");
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");

		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Criteria c = session.createCriteria(Employee.class);

		// On Projection we can apply on some partial required object

		
		 * Projection projection = Projections.property("name");
		 * c.setProjection(projection); List<String> emp = c.list(); for (String string
		 * : emp) { System.out.println(string); }
		 

		Projection p1 = Projections.property("name");
		Projection p2 = Projections.property("email");
		ProjectionList plist = Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		c.setProjection(plist);
		List<Employee> list = c.list();
		for (Employee object : list) {
			System.out.println(object.getName() + " " + object.getEmail());
		}
	}*/
}
