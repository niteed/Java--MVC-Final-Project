<%@ page import = "com.amala.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background = "10.jpg ">
<form action = "MyServletForDelete" method = "post">
<br><br>
<h1 align = "center" >Delete student information</h1>
<div class = "container">
<table align = "center">
<tr><td>Enter Student id :       </td><td><input type = "text" name = "sid" id = 'box1'></td></tr>
<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
<tr><td>  </td><td><input type = "submit" value = "Delete" id = "btn"></td></tr>
</table>
</div>
</form>
</body>
</html>