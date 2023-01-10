<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<h1>    </h1>
<div class="container">
  <h2> All Employees Data</h2>
       
  <table class="table">
    <thead>
      <tr>
        <th>ID</th>
        <th>UNAME</th>
        <th>PASSWORD</th>
        <th>FNAME</th>
        <th>EMAIL</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${userList}" var="user">
      <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.userPassword}</td>
        <td>${user.userFullName}</td>
        <td>${user.userEmail}</td>
          
        <td >
            <a href="ShowEditFormServlet?id=${user.id}">
            <button type="button" class="btn btn-primary">E</button>
            </a>
               <a href="DeleteUserServlet?id=${user.id}">
           <button type="button" class="btn btn-danger">D</button>
            </a>
        </td> 
          
          
      </tr>
      </c:forEach>
      
       </tbody> 
  </table>
  <div>
  <a href="Login.jsp" >
      <button type="button" class="btn btn-danger"> Logout</button>
      </a>
  </div>
  
  
 
</div>






</body>
</html>