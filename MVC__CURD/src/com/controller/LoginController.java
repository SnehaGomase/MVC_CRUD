package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.service.ServiceInterface;
import com.service.ServiceInterfaceImplemen;
@WebServlet(urlPatterns = "/log")
public class LoginController  extends HttpServlet
{ 
	ServiceInterface si=new ServiceInterfaceImplemen();
	
			@Override
			protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	        {
				String un=req.getParameter("username");
				String pw=req.getParameter("password");
				
				req.setAttribute("USERNAME", un);
				req.setAttribute("PASSWORD", pw);
				
				if(un.equals("admin")&&pw.equals("admin123"))
				{
					List<Student> list=si.getAllData();
					req.setAttribute("LIST", list);
					RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
					rd.forward(req, resp);
					
				}
		/*
		 * else { List<Student>list=si.getSingleData(un, pw); req.setAttribute("LIST",
		 * list); RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
		 * rd.forward(req, resp);
		 * 
		 * }
		 */
				
				//resp.sendRedirect("success.jsp");
			}
		
}
