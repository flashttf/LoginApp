package com.bridgelabz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.Dao.DaoImpl;
import com.bridgelabz.Dao.InterfaceDao;
import com.bridgelabz.pojo.User;


@WebServlet("/register")
public class RegisterController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		User user=new User();
		user.setName(req.getParameter("name"));
		user.setUsername(req.getParameter("userName"));
		user.setEmail(req.getParameter("email"));
		user.setDob(req.getParameter("dob"));
		user.setPhonenumber(req.getParameter("phone"));
		user.setPassword(req.getParameter("password"));
		
		InterfaceDao dao=DaoImpl.getInstance();
		System.err.println(user.toString());
		
		if(user.getPassword().equals(req.getParameter("confirmpassword"))) {
			System.out.println("Registration Successfull");
			try {
				dao.userRegister(user);
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Registration Failed. Password not matching");
		}
	}
}
