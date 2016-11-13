package com.jensen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ControllerServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = -1;
		if (request.getParameter("id") != null) {
			try {
					id = Integer.valueOf(request.getParameter("id"));
			} catch (NumberFormatException e) {
				System.out.println("Not a valid id");
			}
		}
		
		if (id > -1) 
		// send user to selected blog post
		{
			MockData mockData = new MockData();
			BlogPost blogPost = mockData.getBlogPost(id);
			
			request.setAttribute("blogpost", blogPost);

			String nextJSP = "/blog.jsp";
			request.getRequestDispatcher(nextJSP).forward(request, response);
		} else 
		// Send user to index page
		{
			String nextJSP = "/index.jsp";
			request.getRequestDispatcher(nextJSP).forward(request, response);
}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
