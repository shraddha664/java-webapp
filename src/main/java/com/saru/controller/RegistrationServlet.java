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

import com.saru.DTO.User;


@WebServlet("/registrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hey");
		String id=request.getParameter("userid");
		String userName=request.getParameter("username");
		String userPassword=request.getParameter("userpassword");
		String userFullName=request.getParameter("fullname");
		String userEmail=request.getParameter("useremail");
		String insertSQL="INSERT INTO users values(?,?,?,?,?)";
		User user=new User();
		try {
			System.out.println("hey2");
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","spmysql");
			PreparedStatement prepareStatement=connection.prepareStatement(insertSQL);
		prepareStatement.setInt(1, Integer.parseInt(id));
			prepareStatement.setString(2, userName);
		prepareStatement.setString(3, userPassword);
		prepareStatement.setString(4, userFullName);
		prepareStatement.setString(5, userEmail);
			user.setUserEmail(userEmail);

			prepareStatement.executeUpdate();
		System.out.println("hey3");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("user", user);
		System.out.println("hey4");
		RequestDispatcher dispatcher=request.getRequestDispatcher("Login.jsp");
		dispatcher.forward(request, response);
		System.out.println("hey5");
	}

}
