package com.scp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e = new Employee(1,"abc");
		
		Configuration cfg = new Configuration();
		SessionFactory session = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session1 = session.openSession();
		Transaction tr=session1.beginTransaction();
		session1.save(e);
		tr.commit();
		session1.flush();
		

	}

}
