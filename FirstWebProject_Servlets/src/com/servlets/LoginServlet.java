package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
@WebInitParam(name = "test", value = "Amarsandhu")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	
	public void init(ServletConfig config) throws ServletException {
		String test = config.getInitParameter("test");
		System.out.println("init parameter given through annotation.."+test);
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Welcome to the Login screen");

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		HttpSession session = request.getSession(true);
		int loginAttempts = 0;

		if (userName.equals("admin") && password.equals("admin")) {
			out.println("login successfull.....");
		} else {
			String loginAttemtsStr = (String) session.getAttribute("loginAttempts");

			if (loginAttemtsStr != null) {
				loginAttempts = Integer.parseInt(loginAttemtsStr);
			}
			loginAttempts++;
			out.println("failed attempt number : "+ loginAttempts);
			if (loginAttempts > 3) {
				out.println("3 logins attempted contact admin for resetting");
			} else {
				session.setAttribute("loginAttempts", loginAttempts + "");
				out.println("login failed..");
			}
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
