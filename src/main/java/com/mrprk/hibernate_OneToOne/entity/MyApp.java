package com.mrprk.hibernate_OneToOne.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyApp {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		config.addAnnotatedClass(AadharDetails.class);
		config.addAnnotatedClass(Teacher.class);

		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();

		// Here we are going to initialize the object of Aadhar and teacher class
		AadharDetails aadhar = new AadharDetails();
		aadhar.setAadharCardNumber("786523129876");

		Teacher teacher = new Teacher();
		teacher.setTeacherId(1011);
		teacher.setTeacherName("Swagatam Basu");
		teacher.setTeacherSubject("Java");
		teacher.setAadharDetails(aadhar);

		session.beginTransaction();
		// here we need to save

		session.save(aadhar);
		session.save(teacher);

		session.getTransaction().commit();

	}

}
