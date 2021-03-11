package com.mads.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class load_stud {
	public static void main(String[] args) 
	{
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Student std = session.get(Student.class,1);
		System.out.println("Student Data");
		System.out.println("Student name :"+std.getStudName());
		System.out.println("Student Address :"+std.getStudAddress());
		
	
	

}
}