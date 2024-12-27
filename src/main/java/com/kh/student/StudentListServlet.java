package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 학생 리스트 조회
 * url : /student/list
 */
@WebServlet("/student/list")
public class StudentListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student("일용자",99,88));
		sList.add(new Student("이용자",77,88));
		sList.add(new Student("삼용자",66,55));
		sList.add(new Student("사용자",44,55));
		
		request.setAttribute("sList", sList);
		request.setAttribute("student", sList.get(0));
//		request.setAttribute("name", sList.get(0).getName());
//		request.setAttribute("fScore", sList.get(0).getFirstScore());
//		request.setAttribute("sScore", sList.get(0).getSecondScore());
//		request.setAttribute("name1", sList.get(1).getName());
//		request.setAttribute("fScore1", sList.get(1).getFirstScore());
//		request.setAttribute("sScore1", sList.get(1).getSecondScore());
		
//		for(Student std : sList) {
//			request.setAttribute("name", std.getName());
//			request.setAttribute("fScore", std.getFirstScore());
//			request.setAttribute("sScore", std.getSecondScore());
//		}
		
		// setAttribute를 한 다음에 forward를 할 것
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/student/list.jsp");
		view.forward(request, response);
		
//		response.setContentType("text/html;charset=utf-8"); // 한글 안 깨지게 유니코드 사용
//		PrintWriter out = response.getWriter(); // 웹페이지에 출력하기 위한 객체
//		out.println("<h1>학생 리스트 조회</h1>");
//		for(Student std : sList) {
//			String name = std.getName();
//			int fScore = std.getFirstScore();
//			int sScore = std.getSecondScore();
//			out.println("<ul><li>학생 이름 : "+name+"</li>");
//			out.println("<li>1차 점수 : "+fScore+"점</li>");
//			out.println("<li>2차 점수 : "+sScore+"점</li></ul>");	
//		}
		
//		for(Student std : sList)
//			System.out.println(std.toString());
		
		
//		RequestDispatcher view;
//		view = request.getRequestDispatcher("");
//		view.forward(request, response);
	}
}
