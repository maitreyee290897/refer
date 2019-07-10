<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>scripting elements</h1>
<h2>
<%!
	int a =10;
	int b =20;
	int i=1;

%>
<%
	int sum = a+b;
%>
the val of a is :<%= a %><br>
the val of b is :<%= b %><br>
the sum of a and b is :<%= sum %><br>
you visited :<%= i++ %> times<br>

</h2>
</body>
</html>