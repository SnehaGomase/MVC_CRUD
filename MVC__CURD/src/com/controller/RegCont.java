package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.service.ServiceInterface;
import com.service.ServiceInterfaceImplemen;

@WebServlet("/reg")

public class RegCont extends HttpServlet
{ ServiceInterface si=new ServiceInterfaceImplemen();
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	 Student stu=new Student();
	 
	 stu.setSname(req.getParameter("sname"));
	 stu.setSaddr(req.getParameter("saddr"));
	 stu.setUsername(req.getParameter("username")); 
	 stu.setPassword(req.getParameter("password"));
	 
	 si.savedata(stu);
	 
	 resp.sendRedirect("login.jsp");
	 
}
}
