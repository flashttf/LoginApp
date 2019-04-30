package com.bridgelabz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.Dao.DaoImpl;
import com.bridgelabz.Dao.InterfaceDao;


@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		InterfaceDao dao=DaoImpl.getInstance();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		boolean check;
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		
		check=dao.loginUser(username, password);
		if(check==true) {
			System.out.println("Login Successfull");
			req.setAttribute("name", username);
			req.getRequestDispatcher("welcome.jsp").forward(req, resp);
		}
		else {
			System.out.println("password mismatch");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
