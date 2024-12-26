<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 완료 페이지</title>
<%
	String message = (String)request.getAttribute("message");
%>
</head>
<body>
	<h1><%=message %></h1>
	<form action="/student/login">
	<input type = "submit" value = "되돌아가기">
	</form>
</body>
</html>