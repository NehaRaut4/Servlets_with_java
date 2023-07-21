package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	//service method to write business logic it has two parameters request and response
	//as it uses http protocol so both request and response are of HttpServlet type
	//doPost() methods accept request through post method from client
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		//accepting i/p parameters from client i.e num1 and num2
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		
		int ans = n1+n2;
		//System.out.println(ans);//Prints data on console so wont print on browser
		//to print on browser we require PrintWriter object
		//servlet creates page as response
		PrintWriter pw = res.getWriter();
		pw.print("Addition - "+ans);
		
	}
	

}
