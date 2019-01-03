package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.HibernateTemplate;

import model.Student;

public class StudentDaoImplHt implements StudentDaoInterface {

	HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	
	@Override
	public int save(Student student) {
		int i = (Integer) ht.save(student);
	return i;
	}
	
	@Override
	public boolean update(Student student) {
		
	return false;
	}

	@Override
	public boolean delete(Student student) {
		
	return false;
	}

	@Override
	public boolean findbyPk(int pk) {
		
	return false;
	}

	@Override
	public List<Student> findAllUsingHql() {
		List<Student> slList = (List<Student>) ht.find("from student");
	return slList;
	}

	@Override
	public List<Student> findAllUsingCriteria() {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Student.class);
		List<Student> list = (List<Student>) ht.findByCriteria(criteria);
	return list;
	}
}
