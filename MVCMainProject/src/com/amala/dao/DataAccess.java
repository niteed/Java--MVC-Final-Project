package com.amala.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.amala.model.Student;

public class DataAccess 
{
	public void insert(Student s)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MVCMainProject", "root", "welcome");
			String query = "insert into Student (sid, sname ,gender, sub,  qualification,email) values (?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, s.getSid());
			ps.setString(2, s.getSname());
			ps.setString(3, s.getGender());
			ps.setString(4, s.getSub());
			ps.setString(5, s.getQua());
			ps.setString(6, s.getEmail());
			
			
			ps.executeUpdate();
			
			//Statement s = con.createStatement();
			//int result = s.executeUpdate("insert into student(s_id, s_name, email, qualification, s_password) values('"+s_id+"','"+name+"','"+email+"','"+qua+"','"+pass+"')");
			/*if(result > 0)
			{
				out.println("You have successfully Registered !!!");
			}
			else
			{
				out.println("not inserted");
				
			}*/
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void update(String sid, String sname, String qua, String gender, String sub, String email) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MVCMainProject", "root", "welcome");
			PreparedStatement p = con.prepareStatement("update student set  sname = '"+sname+"',qualification = '"+qua+"',gender = '"+gender+"', sub = '"+sub+"',email = '"+email+"'  where sid= '"+sid+"' ");
			/*p.setString(1, qua );
			p.setString(2, email);
			p.setString(3, s_id);*/
			p.executeUpdate();
	con.close();
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void delete(String sid) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MVCMainProject", "root", "welcome");
			PreparedStatement s = con.prepareStatement("delete from Student where sid = '"+sid+"' ");
			//s.setString(1, sid);
			s.executeUpdate();
	con.close();
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void read() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletjdbc?autoReconnect=true&useSSL=false", "root", "welcome");
			Statement s = con.createStatement();
			ResultSet r = s.executeQuery("select * from student");
			System.out.println("\t\t\t  STUDENT DETAILS \n");
			//System.out.println("\t \t Name\t\t Subject\t Email\t");
			while (r.next() == true) 
			{

				System.out.println("Student id : " +r.getInt(1)); 
				System.out.println("Student Name : " + r.getString(2));
				System.out.println("Qualification : " + r.getString(3));
				System.out.println("Email : " + r.getString(4));  
				System.out.println("Password : " +  r.getString(5));
				System.out.println();
			}
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
