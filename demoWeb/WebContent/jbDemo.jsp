<%@page import="com.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>java bean demo</h1>
<hr>
<h2>
<jsp:useBean id="p1" class="com.Person"></jsp:useBean>
<jsp:setProperty property="name" name="p1" value="mai"/>
<jsp:setProperty property="age" name="p1" value="22"/>
name: <jsp:getProperty property="name" name="p1"/><br>
age: <jsp:getProperty property="age" name="p1"/><br>
<%
com.Person p2= new com.Person();
p2.setName("mai");
p2.setAge(21);
out.println("name " +p2.getName());
out.println("name " +p2.getAge());

%>





</h2>
</body>
</html>