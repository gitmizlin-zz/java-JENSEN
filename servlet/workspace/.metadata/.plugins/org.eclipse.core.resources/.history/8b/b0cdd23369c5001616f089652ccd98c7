package com.jensen;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName").trim();
		String password = request.getParameter("password").trim();

		if (userName == null || userName.equals("") || password == null || password.equals("")) {
			out.print("Enter both username and password. <br><br>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.html");
			requestDispatcher.include(request, response);
		}

		else if (userName.equals("mi") && password.equals("111")) {
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
			session.setAttribute("password", password);
			out.println("Login successful:)<br/><br/>");
			
//			out.println("<a href='DisplaySessionValueServlet'>" + "Get session info</a>");
			userName = (String) session.getAttribute("userName");
			password = (String) session.getAttribute("password");
			out.println("Username: " + userName + "<br><br>");
			out.println("Password: " + password);
			out.println("<br><br><a href=index.html>" + "Go back to TOP</a>");
			out.println("<form action='LogoutServlet' method='post'>");
			out.println("<input type='submit' value='Logout' /></form>");			
			
		    
			out.close();

		} else {
			out.print("Invalid username or password! <br/><br/>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.html");
			requestDispatcher.include(request, response);
		}
	}
}