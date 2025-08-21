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

        Employee e2 = new Employee();
        e2.seteID(102);
        e2.seteName("Emp2");
        e2.setePhone(981234567);

        Employee e3 = new Employee();
        e3.seteID(103);
        e3.seteName("Emp3");
        e3.setePhone(984561237);

        Department d1 = new Department();
        d1.setdName("Sales");
        d1.setDtId(201);

        Department d2 = new Department();
        d2.setdName("HR");
        d2.setDtId(202);

        //One to Many
        //d1.setEmp(e1);
        //d2.setEmp(e1);

        // set relationships (both sides)
        d1.setEmp(Arrays.asList(e1, e2));
        d2.setEmp(Arrays.asList(e2));

        e1.setDepartment(Arrays.asList(d1, d2));
        e2.setDepartment(Arrays.asList(d1, d2));
        e3.setDepartment(Arrays.asList(d2));

        //SetUp Hibernate
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Employee.class);
        cfg.addAnnotatedClass(Department.class);
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t1 = session.beginTransaction();

        //Session Persist
        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        session.persist(d1);
        session.persist(d2);

        //Commit Changes to PgAdmin or Postgres
        t1.commit();
        session.close();
        sf.close();

        System.out.println("Data Added Successfully!!");
    }
}
