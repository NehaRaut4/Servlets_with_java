package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException	
	{
		//accepting i/p parameters from client i.e num1 and num2
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		
		int ans = n1+n2;
		//servlet collaberation using RequestDispatcher - calling servlet from servlet
		//AddServlet calls SqServlet
		req.setAttribute("num", ans);//when we want pass any value for further calculation
		//setAttribute in source and  getAttribute in destination servlet
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		//("sq") ith the path i.e url pattern of Servlet where we want to dispacth request 
		//from a source servlet to destination servlet here we dispatching request from
		//AddServlet to SquareServlet(calculates the square of result of addition)
		
		
	}
		
}
