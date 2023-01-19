package com.project.LABTEST19JAN;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.entity.Project;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		Employee e1 = new Employee();
		e1.setE_id(101);
		e1.setF_name("Pranjal");
		e1.setL_name("Rajeev");

		Project p1 = new Project();
		p1.setP_id(101);
		p1.setP_name("HTML");

		s.save(e1);
		s.save(p1);
		tr.commit();
		System.out.println("Object Saved...");
	}
}
