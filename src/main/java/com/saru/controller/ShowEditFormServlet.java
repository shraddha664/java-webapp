package com.saru.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saru.DTO.User;

/**
 * Servlet implementation class ShowEditFormServlet
 */
@WebServlet("/ShowEditFormServlet")
public class ShowEditFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uid=request.getParameter("id");
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","spmysql");
		 PreparedStatement ps=conn.prepareStatement("select * from users where id=?");
		 ps.setInt(1, Integer.parseInt(uid));
		
		 System.out.println("edit servlet001");
		ResultSet rs= ps.executeQuery();	
		if(rs.next()){
			
			User user=new User();
			user.setId(rs.getInt(1));
			user.setUserName(rs.getString(2));
			user.setUserPassword(rs.getString(3));
			user.setUserFullName(rs.getString(4));
			user.setUserEmail(rs.getString(5));
			
			System.out.println("edit servlet002");
			
			request.setAttribute("user", user);
			
			request.getRequestDispatcher("EditForm.jsp").forward(request, response);
		}
			
			
		

		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
