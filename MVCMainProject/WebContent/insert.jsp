<%@ page import = "com.amala.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<title>Student Registration</title>
<link rel = "stylesheet" href = "insert.css" type = text/css>
</head>
<body background = "10.jpg ">
<form action = "MyServlet" method = "post">
<h1>Student Registration</h1>
<div class = "container">
<table>
<tr><td>Enter Student id : </td><td><input type = "text" name = "sid"></td></tr>
<tr><td>Enter Student name : </td><td><input type = "text" name = "sname"></td></tr>
<tr><td>Select Gender : </td><td><input type = "radio"  name = "gender" value = "male"  >Male
				<input type = "radio"  name = "gender" value = "female">Female</td></tr>
<tr><td>Enter Qualification : </td><td><input type = "text" name = "qua"></td></tr>
<tr><td>Enter Subject : </td><td><input type = "text" name = "sub" ></td></tr>
<tr><td>Enter Email : </td><td><input type = "text" name = "email"></td></tr>

<tr><td><input type = "submit" value = "Save"></td>
<td><input type = "button" value = "Go To Home" onclick = "document.location = 'admin.html'"></td></tr>
</table>
</div>
</form>
<script>
function home()
{
	document.location.href = "admin.html";
	}
</script>
</body>
</html>