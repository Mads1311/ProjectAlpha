package com.mads.hiber;


	
	
	import java.util.Date;
	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	@SuppressWarnings("deprecation")
	public class insertdata_criteria {
	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure().addAnnotatedClass(Student.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction  transaction=session.beginTransaction();
	Query query=session.createSQLQuery("insert into Student(studId,studName,studAddress,studContact,studEmail) values(:studId,:studName,:studAddress,:studContact,:studEmail)");
	query.setParameter("StudId", 5);
	query.setParameter("studName", "Rashi");
	query.setParameter("studAddress", "Pune");
	query.setParameter("studContact", 123456);
	query.setParameter("studEmail", "rashi@gmail.com");
	int result=query.executeUpdate();
	transaction.commit();
	if(result>0)
	{
	System.out.println("Student Inserted Successfully!");
	}}
	

}
