package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.service.ServiceInterface;
import com.service.ServiceInterfaceImplemen;

@WebServlet("/update123")

public class UpdateContr extends HttpServlet
{
	ServiceInterface si= new ServiceInterfaceImplemen();
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
	int did=Integer.parseInt(req.getParameter("sid"));
	String un=req.getParameter("a");
	String pw=req.getParameter("b");
	
	req.setAttribute("a", un);
	req.setAttribute("b", pw);
	
	Student stu=si.editdata(did);
	req.setAttribute("data", stu);
	
	RequestDispatcher rd=req.getRequestDispatcher("update.jsp");
	rd.forward(req, resp);
	
}
}
