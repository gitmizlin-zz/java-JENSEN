package com.javawithease.business;

import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;   

/** * This class is used to show the 
 * * message when user logged in successfully. */ 

public class WelcomeServlet extends HttpServlet { 
	private static final long serialVersionUID = 1L;   
	
	//no-argument constructor 
	public WelcomeServlet() {
		
	}   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();   
		out.println("<html><body>"); 
		out.println("<h1>You are logged in " + "successfully.</h1>"); 
		out.println("</html></body>");	
	} 
}