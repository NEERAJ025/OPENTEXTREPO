package com.opentext.hibernatecrudoperation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.hibernatecrudoperation.dto.Emp;

public class AppUpdate {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.seteId(10);
		e.seteName("Ashu");
		e.setDob("1995/7/10");
		e.setGender("male");
		e.setPhoneNo(1234567899);
		e.setEmailId("abc@xyx.com");
		e.setDesignation("developer");
		e.setJoiningDate("2019/6/8");
		e.setSalary(20000);
		e.setMgrId(106);
		e.setDeptId(5);
		
		
		Configuration config=new Configuration();
		config.addAnnotatedClass(Emp.class);
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(e);
		transaction.commit();
		session.close();
	}

}
