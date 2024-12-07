package com.klu.jfsd_hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

public class HQl 
{
	public static void main(String[] args)
	{
		try 
		{
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sess=cfg.buildSessionFactory();
			Session s =sess.openSession();
			Transaction txn=s.beginTransaction();
			
			 Query q = s.createQuery("from student"); 
			   List<student>list=q.list();
			   System.out.println(list);
			   for(student s1 : list) 
			   {
			      System.out.println(s1);
			     }
			   
			    
		}
		catch(Exception e)
    	{
    	System.out.println("Error");
    	}
		
	}

}
