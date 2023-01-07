<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">


  <h2>edit form</h2>
  <form action="<%= request.getContextPath()%>/updateServlet" method="post">
   <div class="form-group">
      <label>Id:</label>
      <input type="text" class="form-control"  name="id"  value="${user.id}" readonly>
    </div>
     <div class="form-group">
      <label>Uname:</label>
      <input type="text" class="form-control"  name="username" value="${user.userName}">
    </div>
     <div class="form-group">
      <label>Password:</label>
      <input type="password" class="form-control"  name="password" value="${user.userPassword}">
    </div>
  
    <div class="form-group">
      <label>Full name:</label>
      <input type="text" class="form-control"  name="fullname" value="${user.userFullName}">
    </div>
    <div class="form-group">
      <label>Email:</label>
      <input type="email" class="form-control"  name="email" value="${user.userEmail}">
    </div>
    
    <button type="submit" class="btn btn-primary">update</button>
    
   
  </form>
</div>





</body>
</html>