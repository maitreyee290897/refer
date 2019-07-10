package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.UserBean;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<h1>unauthorised access</h1>");
		pw.println("<h3>To try again <a href='login.html'>Click here</a></h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		PrintWriter out=response.getWriter();
		 
			/*out.println("<h1>");
			out.println("Welcome ! "+ name);
			out.println("</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("final");
			rd.forward(request, response);*/
			UserBean u1=new UserBean();
			boolean k=u1.validate(name, pwd);
			System.out.println(k);
			if(k==true) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
				rd.forward(request, response);
				System.out.println("lll");
			
		}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		
	}

}
