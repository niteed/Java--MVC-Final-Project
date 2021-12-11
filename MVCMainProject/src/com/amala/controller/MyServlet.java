package com.amala.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amala.dao.DataAccess;
import com.amala.model.Student;


/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//String a_email = request.getParameter("email");
		//String a_password = request.getParameter("password");
		//response.sendRedirect("login.html");
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String qua = request.getParameter("qua");
		String gender = request.getParameter("gender");
		String sub = request.getParameter("sub");
		String email = request.getParameter("email");
	  //create student object
	  
	  		Student s = new Student(sid,sname,gender,sub,email, qua);
	  	  DataAccess da = new DataAccess();
	  		da.insert(s);
	  		request.setAttribute("stu", s);
	  		//pass student object to jsp
	  		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");   //redirect to jsp pages
		    rd.forward(request, response);
	  		
	  	
	}

}

