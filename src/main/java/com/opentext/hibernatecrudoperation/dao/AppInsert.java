package com.opentext.hibernatecrudoperation.dao;
import org.hibernate.cfg.Configuration;
import com.opentext.hibernatecrudoperation.dto.Emp;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class AppInsert {

	public static void main(String[] args) {
	
				Emp e=new Emp();
				e.seteId(10);
				e.seteName("rahul");
				e.setDob("1994/7/10");
				e.setGender("male");
				e.setPhoneNo(1234567890);
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
				session.save(e);
				transaction.commit();
				session.close();
				 
			}

		

	}


