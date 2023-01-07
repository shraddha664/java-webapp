package com.saru.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saru.DTO.User;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String selectSQL="SELECT * from users";
		List<User>userList=new ArrayList<>();
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","spmysql");
			PreparedStatement prepareStatement=connection.prepareStatement(selectSQL);
		   ResultSet rs=prepareStatement.executeQuery();
		   
		   while(rs.next()) {
		   User user=new User();
			   int id=rs.getInt(1);
			   String uname=rs.getString(2);
			   String pswrd=rs.getString(3);
			   String fname=rs.getString(4);
			   String uemail=rs.getString(5);
			   user.setId(id);
			   user.setUserName(uname);
			   user.setUserPassword(pswrd);
			   user.setUserEmail(uemail);
			   user.setUserFullName(fname);
			   userList.add(user);
			  
		   }
		   
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.setAttribute("userList", userList);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("ShowInfo.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login1");
		
		String selectSQL="SELECT * from users";
		List<User>userList=new ArrayList<>();
		
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","spmysql");
			PreparedStatement prepareStatement=connection.prepareStatement(selectSQL);
		   ResultSet rs=prepareStatement.executeQuery();
		   
		   while(rs.next()) {
		   User user=new User();
			   int id=rs.getInt(1);
			   String uname=rs.getString(2);
			   String pswrd=rs.getString(3);
			   String fname=rs.getString(4);
			   String uemail=rs.getString(5);
			   user.setId(id);
			   user.setUserName(uname);
			   user.setUserPassword(pswrd);
			   user.setUserEmail(uemail);
			   user.setUserFullName(fname);
			   userList.add(user);
			  
		   }
		   
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.setAttribute("userList", userList);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("ShowInfo.jsp");
		dispatcher.forward(request, response);
	}

}
