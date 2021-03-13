package com.ltts.DemoHibernate;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        
        
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t= session.beginTransaction();
        Employee e= new Employee();
        e.setEmpid(101);
        e.setEmpname("shaloo");
        e.setEmpaddress("Ranchi");
       
        session.save(e);
        t.commit();
        factory.close();
        session.close();
    }

}