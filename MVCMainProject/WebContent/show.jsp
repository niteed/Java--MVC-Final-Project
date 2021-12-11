<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import = "java.sql.DriverManager" %>
     <%@page import = "java.sql.ResultSet" %>
      <%@page import = "java.sql.Statement" %>
       <%@page import = "java.sql.Connection" %>

<%
String sid = request.getParameter("sid");

String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "MVCMainProject";
String userid = "root";
String password = "welcome";
try
{
	Class.forName(driver);
}
catch(ClassNotFoundException e)
{
	e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>


<!DOCTYPE html>
<html>
<link rel = "stylesheet" href = "show.css" type = text/css>
<body  background = "10.jpg ">
<h1 align = "center" style = "green">Student Information</h1>
<table align = "center" border = "1">
<tr>
<td>Student id</td>
<td>Student name</td>
<td>Gender</td>
<td>Subject</td>
<td>Qualification</td>
<td>Email</td>

</tr>
<%
try
{
	connection = DriverManager.getConnection(connectionUrl+database, userid, password);
	statement  = connection.createStatement();
	String sql = "select * from Student";
resultSet = statement.executeQuery(sql);
while(resultSet.next())
{
%>

<tr>
<td><%= resultSet.getString("sid") %></td>
<td><%= resultSet.getString("sname") %></td>
<td><%= resultSet.getString("gender") %></td>
<td><%= resultSet.getString("sub") %></td>
<td><%= resultSet.getString("qualification") %></td>
<td><%= resultSet.getString("email") %></td></tr>
<%
}
connection.close();
}
catch(Exception e)
{
	e.printStackTrace();
}
%>

</table>
</body>
</html>