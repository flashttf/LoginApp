package com.bridgelabz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.HeuristicMixedException;

import com.bridgelabz.Dao.DaoImpl;
import com.bridgelabz.Dao.InterfaceDao;
import com.bridgelabz.pojo.User;

@SuppressWarnings("serial")
@WebServlet("/changepassword")
public class ChangePassworController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InterfaceDao dao=DaoImpl.getInstance();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String newpassword=req.getParameter("newpassword");
		if(password.equals(newpassword)) {
			dao.changePassword(username, newpassword);
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("forgotpassword.jsp").forward(req, resp);
			System.out.println("Please Enter matching password");
		}
	}
}
