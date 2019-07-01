package com.opentext.hibernatecrudoperation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.hibernatecrudoperation.dto.Emp;

public class AppRead {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.addAnnotatedClass(Emp.class);
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Emp e=session.load(Emp.class, 101);
	
		System.out.println(e.geteName());
		System.out.println(e.getDob());
		System.out.println(e.getGender());
		System.out.println(e.getPhoneNo());
		System.out.println(e.getEmailId());
		System.out.println(e.getDesignation());
		System.out.println(e.getJoiningDate());
		System.out.println(e.getSalary());
		System.out.println(e.getMgrId());
		System.out.println(e.getDeptId());
		session.close();
	}

}
