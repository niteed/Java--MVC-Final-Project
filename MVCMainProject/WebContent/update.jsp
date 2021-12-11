<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body background = "10.jpg ">
<form action = "MyServletForUpdate" method = "post">
<br><br>
<h1 align = "center" >Update Student information</h1>
<div class = "container">
<table align = "center">
<tr><td>Enter Student id :       </td><td><input type = "text" name = "sid" id = 'box1'></td></tr>
<tr><td>Enter Student name : </td><td><input type = "text" name = "sname"></td></tr>
<tr><td>Enter Qualification : </td><td><input type = "text" name = "qua"></td></tr>

<tr><td>Select Gender : </td><td><input type = "radio"  name = "gender" value = "male"  >Male
				<input type = "radio"  name = "gender" value = "female">Female</td></tr>
	<tr><td>Enter Subject : </td><td><input type = "text" name = "sub" ></td></tr>			
<tr><td>Enter Email : </td><td><input type = "text" name = "email"></td></tr>


<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
<tr><td>  </td><td><input type = "submit" value = "Update" id = "btn"></td></tr>
</table>
</div>
</form>
</body>
</html>