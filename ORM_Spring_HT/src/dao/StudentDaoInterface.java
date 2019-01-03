package dao;

import java.util.List;

import model.Student;

public interface StudentDaoInterface {
	
	public int save(Student student);
	public boolean update(Student student);
	public boolean delete(Student student);
	public boolean findbyPk(int pk);
	public List<Student> findAllUsingHql();
	public List<Student> findAllUsingCriteria();
	
} 