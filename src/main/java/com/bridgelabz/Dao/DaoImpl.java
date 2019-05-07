package com.bridgelabz.Dao;

import javax.transaction.HeuristicMixedException;

import org.hibernate.Session;

import com.bridgelabz.HibernateUtil.HibernateUtility;
import com.bridgelabz.pojo.User;


public class DaoImpl implements InterfaceDao{

	public String userRegister(User user) throws HeuristicMixedException {
		Session session= HibernateUtility.getSessionFactory().openSession();
		org.hibernate.Transaction tran=(org.hibernate.Transaction)session.beginTransaction();
		System.out.println(user.toString());
		String userName=(String)session.save(user);
		try {
			tran.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return userName;
	}
	
	public static DaoImpl getInstance() {
		DaoImpl daoImpl=new DaoImpl();
		return daoImpl;
	}

	public boolean loginUser(String username, String password) {
		// TODO Auto-generated method stub
		Session session=HibernateUtility.getSessionFactory().openSession();
		if(session!=null) {
			
			    
			User user=(User) session.get(User.class, username);
			try {
				if(password.equals(user.getPassword())) {
					System.out.println("User: "+user.toString());
					return true;
				}
			} catch (Exception e) {
			 System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("Server Not updated");
		}
		return false; 
	}

	public void changePassword(String username, String newpassword) {
		Session session= HibernateUtility.getSessionFactory().openSession();
		org.hibernate.Transaction tran=(org.hibernate.Transaction)session.beginTransaction();
		
		User user=(User) session.get(User.class, username);
		user.setPassword(newpassword);
		session.save(user);
		tran.commit();
	}
}
