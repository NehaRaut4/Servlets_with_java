package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		int num = (int) req.getAttribute("num");
		int square = num * num;
		PrintWriter pw = res.getWriter();
		pw.print("Square of "+num+" is = "+square);
		
	}

}
