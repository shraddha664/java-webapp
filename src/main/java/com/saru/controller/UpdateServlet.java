package com.saru.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("update");
		
		String id=request.getParameter("id");
		int id2=Integer.parseInt(id);
		String uName=request.getParameter("username");
		String upswrd=request.getParameter("password");
		String ufullname=request.getParameter("fullname");
		String uemail=request.getParameter("email");
		
		String updateSQL="UPDATE users set username='"+uName+"',password='"+upswrd+"',fullname='"+ufullname+"',email='"+uemail+"' WHERE ID='"+id2+"'";
		
		try {
			System.out.println("yaho ho ");
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","spmysql");
			

			PreparedStatement prepareStatement=connection.prepareStatement(updateSQL);
			

		System.out.println("yaho ho5 ");

		int s=prepareStatement.executeUpdate();
		
		System.out.println("yaho ho6 "+s);


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("LoginServlet");
		dispatcher.forward(request, response);

}
}
