<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<div align="center">
<h2>Login Form</h2>
<form action="<%= request.getContextPath()%>/LoginServlet" method="post">
<table>
<tr>
<td><label>Email:</label></td>
<td><input type="email" name="email" value="${user.userEmail}"/></td>
</tr>

<tr>
<td><label>Password:</label></td>
<td><input type="password" name="password" /></td>
</tr>
<tr>
<td><input type="submit" value="login"></td>
<td><a href="Register.jsp" >Click here to register</a></td>
</tr>

</table>
</form>
</div>

</body>
</html>