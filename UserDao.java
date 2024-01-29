package com.org.dao;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.org.entity.User;

public class UserDao {
private SessionFactory sessionFactory;
public UserDao(SessionFactory sessionFactory) {
	super();

	this.sessionFactory= sessionFactory;
	
} 

public boolean saveUser(User user) {
	boolean f=false;
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	int i = (Integer)session.save(user);
	if(i>0) {
		f=true;
	}
	tx.commit();
	session.close();
    return f;
	
    
    public void updatepassword (String password) {
    	
    	Session session1 = sessionFactory.openSession();
    	Transaction tx1 = session1.beginTransaction();
    	
    	
    	
    	
    	tx.commit();
    	session1.close();
        return f1;
    	
    }

    
    

	
}

}

