package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.EmployeeEx;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        EmployeeEx e= new EmployeeEx();
        
        e.setEname("sufiya");
        e.setAddr("Govandi");
        e.setEphone(34215675);
        e.setEsalary(100000);
        s.save(e);
        Transaction t = s.beginTransaction();
        t.commit();
        System.out.println(" All Done ");
        
        	sf.close(); s.close();
    }
}
