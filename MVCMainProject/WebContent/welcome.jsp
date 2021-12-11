<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "stylesheet" href = "welcome.css" type = text/css>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel = "stylesheet" href = "welcome.css" type = text/css>
</head>
<body background = "10.jpg ">

<h1>Welcome Administrator</h1>
<form action = "insert.jsp">
<input type = "button" id = "btn" value = "Insert Student Details" onclick = "document.location = 'insert.jsp'"><br><br>
<input type = "button"  id = "btn" value = "Show Student Details" onclick = "document.location = 'show.jsp'"><br><br>
<input type = "button" id = "btn" value = "Update Student Details" onclick = "document.location = 'update.jsp'" ><br><br>
<input type = "button" id = "btn" value = "Delete Student Details" onclick = "document.location = 'delete.jsp'"><br><br>
</form>
<script>
function show()
{
	document.location.href = "show.jsp";
	}
function insert()
{
	document.location.href = "insert.jsp";
	}
</script>
</body>
</html>