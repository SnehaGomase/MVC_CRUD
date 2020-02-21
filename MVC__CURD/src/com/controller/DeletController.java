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
@WebServlet(urlPatterns = "/delet123")
public class DeletController extends HttpServlet
{ 
	ServiceInterface si=new ServiceInterfaceImplemen();
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	int did=Integer.parseInt(req.getParameter("sid"));
	
	si.deletdata(did);
	
	String un=req.getParameter("a");
	String pw=req.getParameter("b");
	 if(un.equals("admin")&&pw.equals("admin"))
	 {
		 List<Student> list=si.getAllData();
		 req.setAttribute("LIST", list);
		 
		 RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
		  rd.forward(req, resp);
     }
	 else 
	 {
	  RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
	  rd.forward(req, resp);
	 }
	 
	 
}
}
