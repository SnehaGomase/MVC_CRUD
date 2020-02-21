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

@WebServlet("/update2")

public class UpdateController2 extends HttpServlet
{
	
    ServiceInterface si=new ServiceInterfaceImplemen();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String un=req.getParameter("a");
		String pw=req.getParameter("b");
		
		Student stu=new Student();
		
		stu.setSid(Integer.parseInt(req.getParameter("eid")));
		stu.setSname(req.getParameter("sname"));
		stu.setSaddr(req.getParameter("saddr"));
		stu.setUsername(req.getParameter("username"));
		stu.setPassword(req.getParameter("password"));
		
		si.updatedata(stu);
		
		if(un.equals("admin")&&pw.equals("admin"))
		{
			List<Student> list=si.getAllData();
			req.setAttribute("LIST", list);
			RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
			
	    }
		else 
		{
			List<Student> list=si.getSingleData(un,pw);
			req.setAttribute("LIST", list);
			RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
			
		}
		
	
}}