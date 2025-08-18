package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.seteID(101);
        e1.seteName("Akshit");
        e1.setePhone(123456789);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Employee.class);
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t1 = session.beginTransaction();
        session.persist(e1);
        t1.commit();
        session.close();
    }
}