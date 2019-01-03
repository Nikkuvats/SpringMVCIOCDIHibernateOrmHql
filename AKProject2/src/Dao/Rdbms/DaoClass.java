package Dao.Rdbms;


import Dao.DaoInterface;
import Pojo.AbhiPojo;

public class DaoClass extends DBConnectionDao implements DaoInterface{

	@Override
	public void ins(String a, String b) {
		System.out.println("Dao="+a);
		System.out.println("Dao="+b);
		AbhiPojo ap=new AbhiPojo();
		ap.setName(a);
		ap.setMobile(b);
		hibernateTemplate.save(ap);
	}
}
