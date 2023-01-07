<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>

<body>
<div align="center">
<h2>Registration form</h2>
<form action="<%= request.getContextPath()%>/registrationServlet" method="post">
<table>
<tr>
<td><label>Id:</label></td>
<td><input type="number" name="userid"/></td>
</tr>

<tr>
<td><label>Username:</label></td>
<td><input type="text" name="username"/></td>
</tr>

<tr>
<td><label>Password:</label></td>
<td><input type="password" name="userpassword"/></td>
</tr>

<tr>
<td><label>Fullname:</label></td>
<td><input type="text" name="fullname"/></td>
</tr>

<tr>
<td><label>Email:</label></td>
<td><input type="email" name="useremail"/></td>
</tr>

<tr>
<td text-align="center"><input type="submit" value="submit"/></td>
</tr>
</table>
</form>


</div>

</body>
</html>