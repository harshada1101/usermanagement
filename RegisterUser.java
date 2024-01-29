package com.org.servlet;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.controller.HibernateUtil;
import com.org.dao.UserDao;
import com.org.entity.*;
@WebServlet("/register")
public class Registeruser extends HttpServlet {


	protected void doPost(HttpServletResponse  res , HttpServletRequest req)  throws SQLException , IOException{
		String name = req.getParameter("name");
		String salary = req.getParameter("salary");
		
		User user = new User(name, salary)
	    System.out.println(user);
		
		
		UserDao dao = new UserDao(HibernateUtil.getSessionFactory());
		boolean f = dao.saveUser(user);
		if(f) {
			System.out.println("User registred successfully");
			
		}else {
			System.out.println("Something wrong in the server");
		}
		
		
		
	}
}
