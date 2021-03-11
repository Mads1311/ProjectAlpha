package com.mads.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStud {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	Student std = session.get(Student.class, 1);
	session.delete(std);
	tx.commit();
	System.out.println("Data deleted successfully");
	
		
	}

}
