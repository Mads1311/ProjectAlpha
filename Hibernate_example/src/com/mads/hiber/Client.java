package com.mads.hiber;


	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	public class Client {
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure().addAnnotatedClass(Profile.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tt = session.beginTransaction();
	Profile pp = new Profile(1, "JavaByKiran",
	"JavaByKiran", "JBK", "888888888", 10.1, 30);
	session.save(pp);
	tt.commit();
	session.close();
	System.out.println("Data Stored Successfully");
	}
	

}
