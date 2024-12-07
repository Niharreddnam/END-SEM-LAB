package com.klu.jfsd_hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo 
{
    public static void main( String[] args )
    {
    	try
    	{
    		Configuration cfg = new Configuration();
    	      cfg.configure();
    	      SessionFactory sess = cfg.buildSessionFactory();
    	      
    	      Session s = sess.openSession();
    	      
    	      Transaction txn = s.beginTransaction()  ;
    	      
    	      student d = new student();
    	      d.setId(101);
    	      d.setName("nihar");
    	      d.setlocation("kakinada");
    	      d.setHodname("pavan kumar");
    	      s.save(d);
    	      txn.commit();
    	           
    	}
    	catch(Exception e)
    	{
    	System.out.println("Error");
    	}
    }
}
