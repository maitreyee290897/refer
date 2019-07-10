package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.ServletContext;


public class AbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int i=0;
    private String name;
    public AbcServlet() {
        super();
        
    }

	public void init(ServletConfig config) throws ServletException {
		
		name=config.getInitParameter("user");
		System.out.println("Servlet initiated");
	}

	
	public void destroy() {
		System.out.println("servlet destroyed");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("servlet request came : " + ++i);
		
		response.getWriter().println("<h1> good morning "+ name+"<h1>");
		ServletContext ctx = (ServletContext) request.getServletContext();
		String comp = ctx.getInitParameter("company");
		PrintWriter out=response.getWriter();
		out.println("welcome to "+comp);
	}

}
