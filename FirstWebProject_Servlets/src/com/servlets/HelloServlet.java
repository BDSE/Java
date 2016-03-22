package com.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/testServlet")
//if you use this annotation then you dont have to configure the servelet in build.xml
public class HelloServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method from hello servlet called...");
		
		//get context parameters
		
		ServletContext context = config.getServletContext();
		String userLogin = context.getInitParameter("userLogin");
		
		System.out.println("context parameter callerd from HelloServlet is : "+userLogin);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy method from hello servlet called");
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String remoteHost = request.getRemoteHost();
		
		System.out.println("service method from hello servlet called..."+ userName);
		System.out.println(remoteHost);
	}

}
