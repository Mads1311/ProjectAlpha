package com.mads.hiber;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Updatestud_criteria {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		
		Query query = session.createQuery("update Student SET studName=:studName where studId =:studId");
		query.setParameter("studName", "Rashi");
		query.setParameter("studId", 3);
		int i = query.executeUpdate();
		transaction.commit();
		if(i>0)
		{
			System.out.println("Record updated");
		}
}
}
