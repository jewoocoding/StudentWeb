<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름 중복 안내</title>
<style>
	h1 {
		color: red;
	}
</style>
<%
	// getAttribute는 Object 객체를 반환하기 때문에 형변환 해줌
	String message = (String)request.getAttribute("message");
%>
</head>
<body>
	<h1><%= message %></h1>
	<form action="/student/insert">
	이름 : <input type="text" name = "name"><br>
	<input type = "submit" value = "login">
	</form>
</body>
</html>