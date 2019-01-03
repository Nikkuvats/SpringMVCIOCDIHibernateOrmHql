package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private DataSource ds;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public int save(Student student) throws Exception {

	Connection con  = ds.getConnection();
	PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
	
	ps.setInt(1, student.getId());
	ps.setString(2, student.getName());
	ps.setString(3, student.getEmail());
	ps.setString(4, student.getAddress());
	
	int i = ps.executeUpdate();
	con.close();
	
	return i;
	}

	@Override
	public boolean update(Student st) throws Exception {
		
	return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
	
	return false;
	}

	@Override
	public Student findById(int id) throws Exception {
		
	return null;
	}

	@Override
	public Student findByName(String name) throws Exception {
		
	return null;
	}

	@Override
	public Student findByMail(String email) throws Exception {
		
	return null;
	}

	@Override
	public Student findByAddress(String address) throws Exception {
		
	return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		
	return null;
	}
}
