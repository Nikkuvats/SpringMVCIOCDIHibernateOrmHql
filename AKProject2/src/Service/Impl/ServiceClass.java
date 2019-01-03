package Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import Dao.DaoInterface;
import Service.ServiceInterface;

public class ServiceClass implements ServiceInterface {

	@Autowired
	DaoInterface di;
	
	@Override
	public void insert(String a, String b) {
		System.out.println("Service="+a);
		System.out.println("Service="+b);
		di.ins(a,b);
	}
}
