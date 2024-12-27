<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 완료 페이지</title>
<%
	// 꺽쇠 퍼센트는 스크립틀릿이라고 해서 jsp에서 자바코드를 작성하게 해줌
	// 원래 jsp는 실행될 때 servlet으로 변환되어 실행됨. 사실상 서블릿임.
	// **그래서 HTML 기반의 파일이지만 자바코드를 쓸 수 있는 특징을 가짐.
	// 서블릿의 경우에는 어떨까?
	// 서블릿의 경우에는 PrintWriter를 통해서 웹 페이지 태그를 출력할 수 있었음.
	// **jsp와 비교했을 때 자바 기반의 파일이지만 HTML코드를 쓸 수 있는 특징을 가짐.
	// jsp 사용이유
	// - 자바코드와 HTML코드를 분리할 수 있음. -> 지금의 loginResult.jsp는 자바 + HTML 코드가 같이
	// 있는 것이지만 지금하려고 하는 것이 자바코드와 HTML코드를 분리하려고 하는 것임.
	// - servlet과 같은 객체를 공유할 수 있어서 백엔드 단에서 넘어온 데이터를 출력할 수 있음.
	// MVC Model 1, 2 설명
	// - 지금처럼 JSP에 자바코드와 HTML코드가 함께 있는 방식으로 코딩하는 것을 Model 1방식이라고 함.
	// - 쓰면 안 되는 건 아니지만 옛날 방식이며 공동작업시 유지보수가 힘들다는 단점이 있어 안 쓰는 방식
	// - 혼자서 개발할 때는 편리한 부분이 있음. 코드가 한눈에 보이기 때문에 헷갈릴 일이 줄어듦.
	// - 백엔드 프로그래밍(서버 프로그래밍) 부분은 Servlet에서 하고 Servlet에서 처리한 데이터를
	// - jsp에서 출력하도록 모델과 뷰로 나누는 방식을 Model 2방식이라고 함.
	// - 그래서 지금 그 방식대로 코드를 수정해볼 것임. 우선 스클립틀릿은 삭제후 EL을 사용하여 
	// - 데이터를 받아옮 -> 아주 쉬움^^
	// String message = (String)request.getAttribute("message");
%>
</head>
<body>
	<!--꺽쇠 퍼센트 이쿼르 기호 옆에 변수명 대신 
	getAttribute할 때, 전달했던 키값을 달러 안에 적어주면 됨. -->
	<h1>${message }</h1>
	
</body>
</html>