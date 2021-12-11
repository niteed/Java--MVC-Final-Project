package com.amala.model;

public class Student 
{
private String sid;
private String sname;
private String gender;
private String email;
private String qua;
private String sub;


public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getQua() {
	return qua;
}
public void setQua(String qua) {
	this.qua = qua;
}
public Student(String sid, String sname, String gender, String sub,String email, String qua) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.gender = gender;
	this.email = email;
	this.qua = qua;
	this.sub = sub;
}
public Student() {
	super();
}

}
