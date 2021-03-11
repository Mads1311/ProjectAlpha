package com.mads.hiber;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class selectquery_criteria {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Query query = session.createQuery("from Student");
		List<Student> list = query.list();
		for(Student std : list)
		{
				System.out.println(std.getStudId()+""+std.getStudName()+""+std.getStudContact()+""+std.getStudAddress()+""+std.getStudEmail());
		}
	}
	
}
