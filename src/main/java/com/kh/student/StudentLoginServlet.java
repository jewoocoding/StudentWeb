package com.kh.student;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/login/welcome")
public class StudentLoginServlet extends HttpServlet{
	// doGet, doPost 메소드로 get요청과 post요청을 하나의 서블릿으로 처리가능
	// -> StudentLoginViewServlet.java가 필요없음

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get 메소드를 처리
		// 브라우저 주소표시줄에 http:http://localhost:8892/student/login/welcome? 
		// -> get방식이기 때문에 ?뒤에 쿼리스트링이 보임 하지만 입력받은게 없으므로 공백임
		// 그리고 doGet메소드를 실행
		// 엔터를 쳐서 서버에 요청하는 것은 GET방식 요청(기본값)
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/student/loginPage.jsp");
		//view = request.getRequestDispatcher("/WEB-INF/views/student/loginPage.jsp");
		view.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 메소드를 처리
		// form태그를 사용하고 method에 post를 적어서 요청을 하면 Post방식 요청임
		// 현재 post방식은 form 태그로만 가능
		// 데이터를 입력받으면 post방식이기 때문에 
		// http:http://localhost:8892/student/login/welcome -> ?쿼리스트링이 안 보임
		// 그리고 doPost메소드를 실행
		String id = request.getParameter("Id");
		String pw = request.getParameter("Pw");
		
		String message = "";
		
		if(id.equals("admin")&&pw.equals("pass01")) {
			message = "관리자님 환영합니다!!";
		}else {
			message = "일반사용자님 환영합니다!!";
		}
		
		request.setAttribute("message", message);
		RequestDispatcher view;
		view = request.getRequestDispatcher("/WEB-INF/views/student/loginResult.jsp");
		view.forward(request, response);
	}
	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String id = request.getParameter("Id");
//		String pw = request.getParameter("Pw");
//		
//		String message = "";
//		
//		if(id.equals("admin")&&pw.equals("pass01")) {
//			message = "관리자님 환영합니다!!";
//		}else {
//			message = "일반사용자님 환영합니다!!";
//		}
//		
//		request.setAttribute("message", message);
//		RequestDispatcher view;
//		view = request.getRequestDispatcher("/WEB-INF/views/student/loginResult.jsp");
//		view.forward(request, response);
//	}
}
