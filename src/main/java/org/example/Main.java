package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.seteID(101);
        e1.seteName("Akshit");
        e1.setePhone(123456789);

        Department d1 = new Department();
        d1.setdName("Sales");
        d1.setDtId(201);
        d1.setEmp(e1);

        Department d2 = new Department();
        d2.setdName("HR");
        d2.setDtId(202);
        d2.setEmp(e1);

        // Add departments to employee
        e1.setDepartment(Arrays.asList(d1, d2));

        // Hibernate setup
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Employee.class);
        cfg.addAnnotatedClass(Department.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t1 = session.beginTransaction();

        session.persist(e1);  // CascadeType.ALL will save departments too

        t1.commit();
        session.close();
        sf.close();

        System.out.println("Data Added Successfully!!");
    }
}
