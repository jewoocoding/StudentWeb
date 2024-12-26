<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제 성공여부 페이지</title>
<%
	String message = (String)request.getAttribute("message");
	String stdList1 = (String)request.getAttribute("stdList1");
	String stdList2 = (String)request.getAttribute("stdList2");
%>
</head>
<body>
	<h1><%=message %></h1>
	<h1><%=stdList1 %></h1>
	<h1>     ▼</h1>
	<h1><%=stdList2 %></h1>
	<form action="/student/manage">
	<input type = "submit" value ="다른 학생 삭제하러 가기">
	</form>
</body>
</html>