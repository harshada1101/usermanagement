package com.org.servlet;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Loginuser extends HttpServlet {
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws SQLException , IOException
{
	String username=req.getParameter("user");
	String password=req.getParameter("pass");
	
	if(password.equals("tom")) {
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.forward(req, resp);
		
	}
	else {
		PrintWriter pw=resp.getWriter();
		pw.write("<html><body>"+"Sorry your password didn't match"+"</body></html>");
		RequestDispatcher rd=req.getRequestDispatcher("Registeruser.html");
		rd.include(req, resp);
		
	}
	}
}
