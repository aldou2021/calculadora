<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> El resultado es: </h1>
<br>
<%
	 
	out.println(request.getAttribute("resultado"));
%>

</body>
</html>