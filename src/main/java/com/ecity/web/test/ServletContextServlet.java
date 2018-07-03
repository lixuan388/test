package com.ecity.web.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContext")
public class ServletContextServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String p;
		p=getServletContext().getInitParameter("FileServerPath");
		resp.getWriter().println("FileServerPath:"+p+"");
		p=getServletContext().getInitParameter("test-web-context-param");
		resp.getWriter().println("test-web-context-param:"+p+"");
		p=getServletContext().getInitParameter("test-Server-context-param");
		resp.getWriter().println("test-Server-context-param:"+p+"");
		resp.getWriter().flush();
	}

	
}
