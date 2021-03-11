package com.mads.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveorUpdate {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student std = new Student();
		std.setStudId(3);
		std.setStudAddress("Wagholi");
		std.setStudName("Madhuri");
		std.setStudContact("12456");
		std.setStudEmail("abc@gmail.com");
		session.saveOrUpdate(std);
		tx.commit();
		System.out.println("Updated ");
		
		
		
		
	}

}
