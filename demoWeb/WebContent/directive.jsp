<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="java.util.Date" %>
<%@page isErrorPage="true" %>
<%@page info="just for demo" %>
<%@page session="true" %>
<%@page contentType="text/html" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<body>
<h1>Directive Demo</h1>
<hr>
<h2>
todays date : <%= new Date() %> <br>
exception : <%= exception %> <br>
information : <%= getServletInfo() %> <br>
session id : <%=session.getId() %>

<hr>
<%@include file="login.html" %>
<%@include file="demo.jsp" %>
<%@include file="abc.jsp" %>

</h2>
</body>
</html>