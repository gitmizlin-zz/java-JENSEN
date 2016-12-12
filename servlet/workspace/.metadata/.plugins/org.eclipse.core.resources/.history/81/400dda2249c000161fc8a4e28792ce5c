package com.jensen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookieServlet extends HttpServlet { 
	
	private static final long serialVersionUID = 1L;   
	
	public GetCookieServlet() {   
		
	}   
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException { 
		
		res.setContentType("text/html"); 
		PrintWriter out = res.getWriter();   
		
		try { 
			Cookie cookies[] = req.getCookies(); 
			
			for(Cookie cookie : cookies){ 
				out.println("Cookie Name: " + cookie.getName() + " / "); 
				out.println("Cookie Value: " + cookie.getValue() + "<br/><br/>"); 
				out.println(""); 
			}   
			
			out.print("<form action='DeleteCookieServlet' method='POST'>"); 
			out.print("<input type='submit' value='Delete Cookies'>"); 
			out.print("</form>"); 
			out.close(); 
			
		} catch (Exception e) {
			e.printStackTrace(); 
		
		}
	}
}	