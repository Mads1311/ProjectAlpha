package com.mads.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class del_stud_criteria {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sessionfactory=cfg.buildSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction transaction=session.beginTransaction();
		Student std=session.get(Student.class, 2);
		session.delete(std);
		transaction.commit();
		System.out.println("Student data Deleted");
	}
}
