package com.mads.hiber;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Criteriaprograms {

	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure().addAnnotatedClass(Student.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Criteria criteria=session.createCriteria(Student.class);
	List<Student>liststd=criteria.list();
	System.out.println("Student Details");
	for(Student std:liststd)
	{
	System.out.print(std.getStudId()+" ");
	System.out.print(std.getStudName()+" ");
	System.out.print(std.getStudContact()+" ");
	System.out.print(std.getStudEmail()+" ");
	System.out.println(" ");
	}
}
}
