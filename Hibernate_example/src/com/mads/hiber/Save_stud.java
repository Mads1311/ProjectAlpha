package com.mads.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Save_stud {
public static void main(String[] args) {
Configuration cfg = new Configuration();
cfg.configure().addAnnotatedClass(Student.class);
SessionFactory sf = cfg.buildSessionFactory();
Session session = sf.openSession();
Transaction tt = session.beginTransaction();
Student stud=new Student();
stud.setStudName("Kiran");
stud.setStudAddress("Pune");
stud.setStudContact("78965874589");
stud.setStudEmail("kiran@gmail.com");
session.save(stud);
tt.commit();
session.close();
System.out.println("Data Stored Successfully");
}
}