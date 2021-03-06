package com.dell.webapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dell.webapp.bean.User;
import com.dell.webapp.util.HibernateSessionUtil;

public class UserDAO {
    public static void addUser(User user)
    {
    	try {
    		SessionFactory factory = HibernateSessionUtil.buildSessionFactory();
    		Session session = factory.openSession();
    		Transaction tx = session.beginTransaction();
    		
    		session.save(user);
    		tx.commit();
    		session.close();
    	}
    	catch(Exception ex) {
    	  System.out.print("Add user failed "+ex.getMessage().toString());	
    	}
    }
    public static List<User> listUser(){
    	SessionFactory factory = HibernateSessionUtil.buildSessionFactory();
    	Session session = factory.openSession();
        String query = "From User as us";
        List<E> listOfUsers = session.createQuery(query).list();
        return listOfUsers;
    }

}
