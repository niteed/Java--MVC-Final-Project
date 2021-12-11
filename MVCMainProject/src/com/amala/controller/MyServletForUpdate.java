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

/**
 * Servlet implementation class MyServletForUpdate
 */
@WebServlet("/MyServletForUpdate")
public class MyServletForUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServletForUpdate() {
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
				String sid = request.getParameter("sid");
				String sname = request.getParameter("sname");
				String qua = request.getParameter("qua");
				String gender = request.getParameter("gender");
				String sub = request.getParameter("sub");
				String email = request.getParameter("email");
				
				//Student s = new Student(sid,sname,gender,sub,email,qua);
				DataAccess da = new DataAccess();
				da.update(sid, sname, qua, gender,sub,email);
				RequestDispatcher rd = request.getRequestDispatcher("show.jsp");   //redirect to jsp pages
			    rd.forward(request, response);
	}

}
