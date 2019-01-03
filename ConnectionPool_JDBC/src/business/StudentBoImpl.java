package business;

import Dao.StudentDao;
import model.Student;

public class StudentBoImpl implements StudentBo {

	private StudentDao dao;
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	
	@Override
	public int createStudent(Student std) throws Exception {
		
	return dao.save(std);
	}

	@Override
	public boolean updateStudent(Student std) throws Exception {
		
	return dao.update(std);
	}

	@Override
	public boolean deleteStudent(Student std) throws Exception {
		
	return dao.delete(std);
	}	
}
