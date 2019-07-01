package com.opentext.hibernatecrudoperation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.hibernatecrudoperation.dto.Emp;

public class AppDelete {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.addAnnotatedClass(Emp.class);
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Emp emp=session.get(Emp.class, 10);
		session.delete(emp);
		
		transaction.commit();
		session.close();
		
	}

}
