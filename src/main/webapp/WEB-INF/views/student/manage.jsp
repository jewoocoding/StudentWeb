<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생정보 삭제</title>
<style>
	ul>li{
		text-align: center;
	}
</style>
</head>
<body>
	<h1>학생 정보 등록</h1>
	<form action="/student/register" method = "post">
	<ul>
	<li>학생 이름 : <input type = "text" name = "name"></li>
	<li>1차 점수 : <input type = "text" name = "firstScore"></li>
	<li>2차 점수 : <input type = "text" name = "secondScore"></li>
	</ul>
	<input type = "submit" value="등록">
	</form>
	
	<h1>학생 정보 삭제</h1>
	<form action="/student/remove" method="get">
	삭제할 학생 이름 : <input type ="text" name = "name">
	<input type = "submit" value="입력">
	</form>
</body>
</html>